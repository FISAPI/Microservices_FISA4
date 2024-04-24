package com.pay.web.controller;

import com.pay.dao.PayDao;
import com.pay.model.Pay;
import com.pay.web.exceptions.PayExistantException;
import com.pay.web.exceptions.PayImpossibleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    PayDao paiementDao;

    public boolean isValidCardNumber(Long cardNumber) {
        int sum = 0;
        boolean alternate = false;
        String cardNumberString = cardNumber.toString();
        for (int i = cardNumberString.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumberString.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return sum % 10 == 0;
    }

    @PostMapping(value = "/validate")
    public ResponseEntity<Pay> payerUneCommande(@RequestBody PaymentRequest request){
        Long numCard = request.getNumCard();
        int numOrder = request.getNumOrder();
        float montant = request.getMontant();

        // Vérifier si le numéro de carte est valide
        if (!this.isValidCardNumber(numCard)) {
            throw new PayImpossibleException("Le numéro de carte est invalide");
        }

        // Vérifions s'il y a déjà un paiement enregistré pour cette commande
        Pay paiementExistant = paiementDao.findByidCommande(numOrder);
        if(paiementExistant != null) throw new PayImpossibleException("Cette commande est déjà payée");

        // Enregistrer le paiement
        Pay nouveauPaiement = new Pay();
        nouveauPaiement.setIdCommande(numOrder);
        nouveauPaiement.setMontant(montant);

        try {
            paiementDao.save(nouveauPaiement);
        } catch (Exception e) {
            throw new PayImpossibleException("Erreur, impossible d'établir le paiement, réessayez plus tard");
        }

        return new ResponseEntity<Pay>(nouveauPaiement, HttpStatus.CREATED);
    }

}


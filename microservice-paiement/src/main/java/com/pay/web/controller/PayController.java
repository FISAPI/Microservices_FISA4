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
public class PayController {

    @Autowired
    PayDao paiementDao;

    @PostMapping(value = "/paiement")
    public ResponseEntity<Pay>  payerUneCommande(@RequestBody Pay paiement){


        //Vérifions s'il y a déjà un paiement enregistré pour cette commande
        Pay paiementExistant = paiementDao.findByidCommande(paiement.getIdCommande());
        if(paiementExistant != null) throw new PayExistantException("Cette commande est déjà payée");

        //Enregistrer le paiement
        Pay nouveauPaiement = paiementDao.save(paiement);


        if(nouveauPaiement == null) throw new PayImpossibleException("Erreur, impossible d'établir le paiement, réessayez plus tard");



        //TODO Nous allons appeler le Microservice Commandes ici pour lui signifier que le paiement est accepté

        return new ResponseEntity<Pay>(nouveauPaiement, HttpStatus.CREATED);

    }




}

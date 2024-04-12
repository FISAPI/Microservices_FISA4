package com.pay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pay {

    @Id
    @GeneratedValue
    private int id_payment;

    @Column(unique = true)
    private Integer id_order;

    private Long numCard;

    private Integer montant;


    public Pay() {
    }

    public Pay(int id, Integer idCommande,Long numCard, Integer montant) {
        this.id_payment = id;
        this.id_order = idCommande;
        this.montant = montant;
        this.numCard = numCard;
    }

    public int getId() {
        return id_payment;
    }

    public void setId(int id) {
        this.id_payment = id;
    }

    public Integer getIdCommande() {
        return id_order;
    }

    public void setIdCommande(Integer id_order) {
        this.id_order = id_order;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Long getNumCard() {
        return numCard;
    }

    public void setNumCard(Long numCard) {
        this.numCard = numCard;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id_payment +
                ", idCommande=" + id_order +
                ", montant=" + montant +
                '}';
    }

    public boolean isValidCardNumber() {
        int sum = 0;
        boolean alternate = false;
        String cardNumberString = this.numCard.toString();
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
}

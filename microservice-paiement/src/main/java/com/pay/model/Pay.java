package com.pay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pay {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int id_payment;

    @Column(unique = true, name = "id_order")
    private Integer idCommande;

    private Long numCard;

    private Integer montant;


    public Pay() {
    }

    public Pay(int id, Integer idCommande,Long numCard, Integer montant) {
        this.id_payment = id;
        this.idCommande = idCommande;
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
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
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
                ", idCommande=" + idCommande +
                ", montant=" + montant +
                '}';
    }
}

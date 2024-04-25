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

    @Column(unique = true, name = "id_commande")
    private Integer idCommande;

    private float montant;


    public Pay() {
    }

    public Pay(int id, Integer idCommande, float montant) {
        this.id_payment = id;
        this.idCommande = idCommande;
        this.montant = montant;

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

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
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

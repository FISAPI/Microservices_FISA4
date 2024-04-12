package com.pay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pay {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private Integer idCommande;

    private Integer montant;


    public Pay() {
    }

    public Pay(int id, Integer idCommande, Integer montant) {
        this.id = id;
        this.idCommande = idCommande;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", idCommande=" + idCommande +
                ", montant=" + montant +
                '}';
    }
}

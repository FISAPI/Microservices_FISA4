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

    private Integer montant;


    public Pay() {
    }

    public Pay(int id, Integer idCommande, Integer montant) {
        this.id_payment = id;
        this.montant = montant;
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


    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id_payment +
                ", idCommande=" + id_order +
                ", montant=" + montant +
                '}';
    }
}

package com.commande.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Commande_Product {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY) // AUTO (default), IDENTITY, SEQUENCE, TABLE (in Oracle)
    private int id_commande_product;
    private int id_commande;
    private int id_product;
    private int quantite;

    public Commande_Product(int id_commande_product, int id_commande, int id_product, int quantite) {
        this.id_commande_product = id_commande_product;
        this.id_commande = id_commande;
        this.id_product = id_product;
        this.quantite = quantite;
    }

    public Commande_Product() {

    }


    //    Get and Set
    public int getId_commande_product() {
        return id_commande_product;
    }

    public void setId_commande_product(int id_commande_product) {
        this.id_commande_product = id_commande_product;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Commande_Product{" +
                "id_commande_product=" + id_commande_product +
                ", id_commande=" + id_commande +
                ", id_product=" + id_product +
                ", quantite=" + quantite +
                '}';
    }
}
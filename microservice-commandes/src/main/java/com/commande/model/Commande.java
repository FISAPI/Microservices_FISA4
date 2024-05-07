package com.commande.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY) // AUTO (default), IDENTITY, SEQUENCE, TABLE (in Oracle)
    private int id_commande;

    private Date datecommande;

    public Commande(int id, Date datecommande) {
        this.id_commande = id;
        this.datecommande = datecommande;
    }

    public Commande() {

    }

    public int getId() {
        return id_commande;
    }

    public void setId(int id) {
        this.id_commande = id;
    }

    public Date getDateCommande() {
        return datecommande;
    }

    public void setDateCommande(Date datecommande) {
        this.datecommande = datecommande;
    }

    @Override
    public String toString() {
        return "commande{" +
                "id=" + id_commande +
                ", datecommande=" + datecommande +
                '}';
    }
}

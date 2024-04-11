package com.order.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int id_order;

    private Date dateCommande;

    public Order() {
    }

    public Order(int id, Date dateCommande, Boolean commandePayee) {
        this.id_order = id;
        this.dateCommande = dateCommande;
    }

    public int getId() {
        return id_order;
    }

    public void setId(int id) {
        this.id_order = id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Override
    public String toString() {
        return "commande{" +
                "id=" + id_order +
                ", dateCommande=" + dateCommande +
                '}';
    }
}

package com.pay.web.controller;

public class PaymentRequest {
    private Long numCard;
    private int numOrder;
    private float montant;

    // getters et setters
    public Long getNumCard() {
        return numCard;
    }

    public void setNumCard(Long numCard) {
        this.numCard = numCard;
    }

    public int getNumOrder() {return numOrder;}

    public void setNumOrder(int numOrder) {this.numOrder = numOrder;}

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}

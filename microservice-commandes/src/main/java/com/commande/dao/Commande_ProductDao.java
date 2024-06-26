package com.commande.dao;

import com.commande.model.Commande_Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Commande_ProductDao extends JpaRepository<Commande_Product, Integer> {
    List<Commande_Product> findByCommandeId(int commandeId);
}
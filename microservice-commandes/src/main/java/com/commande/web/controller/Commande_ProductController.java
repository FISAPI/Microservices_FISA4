package com.commande.web.controller;

import com.commande.dao.Commande_ProductDao;
import com.commande.model.Commande_Product;
import com.commande.web.exceptions.CommandeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commande/commande_product")
public class Commande_ProductController {
    @Autowired
    Commande_ProductDao commande_prductDao;

    public Commande_ProductController(Commande_ProductDao productRepository){
        this.commande_prductDao = productRepository;
    }

    @GetMapping("/all")
    public List<Commande_Product> getAllCommande_Products() {
        return commande_prductDao.findAll();
    }

    @PostMapping("/create")
    public Commande_Product createCommande_Product(@RequestBody Commande_Product commande_product) {
        return commande_prductDao.save(commande_product);
    }

    @GetMapping(value = "/{id}")
    public Optional<Commande_Product> recupererUneCommande_Product(@PathVariable int id){
        Optional<Commande_Product> commande_product = commande_prductDao.findById(id);
        if(!commande_product.isPresent()) throw new CommandeNotFoundException("Cette commande n'existe pas");
        return commande_product;
    }

    @DeleteMapping(value = "/{id}")
    public void supprimerCommande_Product(@PathVariable int id){
        commande_prductDao.deleteById(id);
    }

}
package com.order.web.controller;


import com.order.dao.OrderDao;
import com.order.model.Order;
import com.order.web.exceptions.OrderNotFoundException;
import com.order.web.exceptions.ImpossibleAjouterOrderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderDao commandesDao;

//    @PostMapping (value = "/create")
//    public ResponseEntity<Order> ajouterCommande(@RequestBody Order commande){
//
//        Order nouvelleCommande = commandesDao.save(commande);
//
//        if(nouvelleCommande == null) throw new ImpossibleAjouterOrderException("Impossible d'ajouter cette commande");
//
//        return new ResponseEntity<Order>(commande, HttpStatus.CREATED);
//    }

//    TODO : Convertir la date lors du create pour vérifier le bon fonctionnement
    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return commandesDao.save(order);
    }


    @GetMapping(value = "/{id}")
    public Optional<Order> recupererUneCommande(@PathVariable int id){

        Optional<Order> commande = commandesDao.findById(id);

        if(!commande.isPresent()) throw new OrderNotFoundException("Cette commande n'existe pas");

        return commande;
    }

}

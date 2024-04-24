package com.commande.web.controller;

import com.commande.dao.CommandeDao;
import com.commande.model.Commande;
import com.commande.web.exceptions.CommandeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commande")
public class CommandeController {

    @Autowired
    CommandeDao commandesDao;

    public CommandeController(CommandeDao productRepository){
        this.commandesDao = productRepository;
    }

//    @PostMapping (value = "/create")
//    public ResponseEntity<Commande> ajouterCommande(@RequestBody Commande commande){
//
//        Commande nouvelleCommande = commandesDao.save(commande);
//
//        if(nouvelleCommande == null) throw new ImpossibleAjouterCommandeException("Impossible d'ajouter cette commande");
//
//        return new ResponseEntity<Commande>(commande, HttpStatus.CREATED);
//    }

    @GetMapping("/all")
    public List<Commande> getAllCommandes() {
        return commandesDao.findAll();
    }

//    TODO : Convertir la date lors du create pour vérifier le bon fonctionnement
    @PostMapping("/create")
    public Commande createCommande(@RequestBody Commande commande) {
        return commandesDao.save(commande);
    }


    @GetMapping(value = "/{id}")
    public Optional<Commande> recupererUneCommande(@PathVariable int id){

        Optional<Commande> commande = commandesDao.findById(id);

        if(!commande.isPresent()) throw new CommandeNotFoundException("Cette commande n'existe pas");

        return commande;
    }

}
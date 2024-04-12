package com.product.web.controller;

import com.product.AppPropertiesConfig;
import com.product.dao.ProductDao;
import com.product.model.Product;
import com.product.web.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RefreshScope
@RestController
public class ProductController {
    private final ProductDao productDao;
    private final AppPropertiesConfig appProperties;

    public ProductController(ProductDao productDao, AppPropertiesConfig appProperties){
        this.productDao = productDao;
        this.appProperties = appProperties;
    }

// Affiche la liste de tous les produits disponibles

    @GetMapping(value = "/Produits")
    public List<Product> listeDesProduits()
    {
        List<Product> products = productDao.findAll();

        if(products.isEmpty()) throw new ProductNotFoundException("Aucun produit n'est disponible à la vente");

        List<Product> listeLimitee = products.subList(0, appProperties.getLimitDeProduits());

        return listeLimitee;
    }

    @GetMapping(value = "/test")
    public int test()
    {
        return appProperties.getLimitDeProduits();
    }
}


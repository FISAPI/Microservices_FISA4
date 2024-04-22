package com.product.web.controller;

import com.product.AppPropertiesConfig;
import com.product.dao.ProductDao;
import com.product.model.Product;
import com.product.web.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

//@RefreshScope
@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductDao productRepository;
    private final AppPropertiesConfig appProperties;

    public ProductController(ProductDao productRepository, AppPropertiesConfig appProperties){
        this.productRepository = productRepository;
        this.appProperties = appProperties;
    }

// Affiche la liste de tous les products disponibles

//    @GetMapping(value = "/Products")
//    public List<Product> listeDesProducts()
//    {
//        List<Product> products = productDao.findAll();
//
//        if(products.isEmpty()) throw new ProductNotFoundException("Aucun product n'est disponible à la vente");
//
//        List<Product> listeLimitee = products.subList(0, appProperties.getLimitDeProducts());
//
//        return listeLimitee;
//    }

    //    @GetMapping(value = "/test")
//    public int test()
//    {
//        return appProperties.getLimitDeProducts();
//    }
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productRepository.findById(id).map(p -> {
            p.setTitre(product.getTitre());
            p.setDescription(product.getDescription());
            p.setPrix(product.getPrix());
            return productRepository.save(p);
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
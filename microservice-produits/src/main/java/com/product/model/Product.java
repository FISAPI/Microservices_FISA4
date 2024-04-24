package com.product.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class  Product {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int id_product;

    private String title;

    private String description;

    private String image;

    private Double prix;


    public Product() {
    }

    public Product(int id, String titre, String description, String image, Double prix) {
        this.id_product = id;
        this.title = titre;
        this.description = description;
        this.image = image;
        this.prix = prix;
    }

    public int getId() {
        return id_product;
    }

    public void setId(int id) {
        this.id_product = id;
    }

    public String getTitre() {
        return title;
    }

    public void setTitre(String titre) {
        this.title = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id_product +
                ", titre='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", prix=" + prix +
                '}';
    }


}

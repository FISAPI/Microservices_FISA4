-- Création de la table "Product"
CREATE TABLE "product" (
                           id_product SERIAL PRIMARY KEY,
                           title VARCHAR(255) NOT NULL,
                           description TEXT,
                           image VARCHAR(255),
                           prix NUMERIC(10, 2) NOT NULL
);

-- Peuplement de la table "Product" avec des données d'exemple
INSERT INTO "product" (title, description, image, prix) VALUES
                                                            ('Exemple de produit 1', 'Description du produit 1', 'image1.jpg', 19.99),
                                                            ('Exemple de produit 2', 'Description du produit 2', 'image2.jpg', 29.99),
                                                            ('Exemple de produit 3', 'Description du produit 3', 'image3.jpg', 39.99);

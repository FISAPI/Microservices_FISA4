-- Création de la table "Commande"
CREATE TABLE "commande" (
    id_commande SERIAL PRIMARY KEY,
    dateCommande TIMESTAMP NOT NULL
);

-- Peuplement de la table "Commande" avec des données d'exemple
INSERT INTO "commande" (datecommande) VALUES
    ('2021-01-01 10:00:00'),
    ('2021-01-02 14:30:00'),
    ('2021-01-03 09:15:00');

-- Création de la table "Commande_product"
CREATE TABLE "commande_product" (
    id_commande_product SERIAL PRIMARY KEY,
    id_commande INTEGER NOT NULL REFERENCES "commande" (id_commande),
    id_product INTEGER NOT NULL REFERENCES "product" (id_product),
    quantity INTEGER
);

-- Peuplement de la table "Commande_product" avec des données d'exemple
INSERT INTO "commande_product" (id_commande, id_product, quantity) VALUES
    (1, 1, 2),
    (1, 2, 1),
    (2, 3, 3),
    (3, 1, 1),
    (3, 2, 1),
    (3, 3, 1);
-- Création de la table "Order"
CREATE TABLE "order" (
    id_order SERIAL PRIMARY KEY,
    dateCommande TIMESTAMP NOT NULL
);

-- Peuplement de la table "Order" avec des données d'exemple
INSERT INTO "order" (dateCommande) VALUES
    ('2021-01-01 10:00:00'),
    ('2021-01-02 14:30:00'),
    ('2021-01-03 09:15:00');
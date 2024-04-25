-- Création de la table "Pay"
CREATE TABLE "pay" (
                       id_payment SERIAL PRIMARY KEY,
                       id_order INTEGER UNIQUE NOT NULL,
                       montant FLOAT NOT NULL
);

-- Peuplement de la table "Pay" avec des données d'exemple
INSERT INTO "pay" (id_order, montant) VALUES
                                                   (1, 100),
                                                   (2, 200),
                                                   (3, 300);
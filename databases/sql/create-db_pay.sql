-- Création de la table "Pay"
CREATE TABLE "pay" (
                       id_payment SERIAL PRIMARY KEY,
                       id_order INTEGER UNIQUE NOT NULL,
                       numCard BIGINT NOT NULL,
                       montant INTEGER NOT NULL
);

-- Peuplement de la table "Pay" avec des données d'exemple
INSERT INTO "pay" (id_order, numCard, montant) VALUES
                                                   (1, 1234567890123456, 100),
                                                   (2, 2345678901234567, 200),
                                                   (3, 3456789012345678, 300);
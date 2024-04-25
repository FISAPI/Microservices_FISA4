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
                                                            ('Air Auvergne Rhone Alpes', 'Vivez les montagnes et les lacs de la région Auvergne Rhône-Alpes', 'assets/img/Bouteille_ARA.png', 19.99),
                                                            ('Air Bourgogne Franche Comté', 'Découvrez les vignobles et les forêts de la région Bourgogne Franche-Comté', 'assets/img/Bouteille_BFC.png', 19.99),
                                                            ('Air Bretagne', 'Respirez l''air marin de la Bretagne et ses côtes sauvages', 'assets/img/Bouteille_Bretagne.png', 19.99),
                                                            ('Air Centre Val de Loire', 'Plongez au cœur des châteaux de la Loire et de la nature préservée de la région Centre Val de Loire', 'assets/img/Bouteille_CVDL.png', 19.99),
                                                            ('Air Corse', 'Évadez-vous sur l''île de beauté et ses paysages époustouflants', 'assets/img/Bouteille_Corse.png', 19.99),
                                                            ('Air Grand Est', 'Partez à la découverte des villages typiques et des montagnes Vosgiennes de la région Grand Est', 'assets/img/Bouteille_GE.png', 19.99),
                                                            ('Air Hauts de France', 'Découvrez les paysages variés et les villes chargées d''histoire des Hauts-de-France', 'assets/img/Bouteille_HDF.png', 19.99),
                                                            ('Air Ile de France', 'Dégustez l''air de la capitale et de ses monuments emblématiques', 'assets/img/Bouteille_IDF.png', 19.99),
                                                            ('Air Normandie', 'Laissez-vous séduire par les falaises et les plages du débarquement de la région Normandie', 'assets/img/Bouteille_Normandie.png', 19.99),
                                                            ('Air Nouvelle Aquitaine', 'Partez à la rencontre des vagues de l''Atlantique et des vignobles bordelais de la région Nouvelle Aquitaine', 'assets/img/Bouteille_NA.png', 19.99),
                                                            ('Air Occitanie', 'Découvrez les paysages méditerranéens et les montagnes des Pyrénées de la région Occitanie', 'assets/img/Bouteille_Occitanie.png', 19.99),
                                                            ('Air Pays de la Loire', 'Respirez l''air iodé des côtes vendéennes et des châteaux de la Loire', 'assets/img/Bouteille_PDL.png', 19.99),
                                                            ('Air Provence Alpes Côte d''Azur', 'Évadez-vous sur les plages de la Côte d''Azur et les montagnes des Alpes du Sud', 'assets/img/Bouteille_PACA.png', 19.99);

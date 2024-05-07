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
                                                            ('Air Auvergne Rhone Alpes', 'Vivez les montagnes et les lacs de la région Auvergne Rhône-Alpes', 'img/Bouteille_ARA.png', 7499.99),
                                                            ('Air Bourgogne Franche Comté', 'Découvrez les vignobles et les forêts de la région Bourgogne Franche-Comté', 'img/BouteilleBFC.png', 49.99),
                                                            ('Air Bretagne', 'Respirez l''air marin de la Bretagne et ses côtes sauvages', 'img/Bouteille_Bretagne.png', 499.99),
                                                            ('Air Centre Val de Loire', 'Plongez au cœur des châteaux de la Loire et de la nature préservée de la région Centre Val de Loire', 'img/Bouteille_CVL.png', 24.99),
                                                            ('Air Corse', 'Évadez-vous sur l''île de beauté et ses paysages époustouflants', 'img/Bouteille_Corse.png', 74.99),
                                                            ('Air Grand Est', 'Partez à la découverte des villages typiques et des montagnes Vosgiennes de la région Grand Est', 'img/Bouteille_Grand_Est.png', 249.99),
                                                            ('Air Hauts de France', 'Découvrez les paysages variés et les villes chargées d''histoire des Hauts-de-France', 'img/Bouteille_HDF.png', 9999.99),
                                                            ('Air Ile de France', 'Dégustez l''air de la capitale et de ses monuments emblématiques', 'img/Bouteille_IDF.png', 0.01),
                                                            ('Air Normandie', 'Laissez-vous séduire par les falaises et les plages du débarquement de la région Normandie', 'img/Bouteille_Normandie.png', 2449.99),
                                                            ('Air Nouvelle Aquitaine', 'Partez à la rencontre des vagues de l''Atlantique et des vignobles bordelais de la région Nouvelle Aquitaine', 'img/Bouteille_Nouvelle_Aquitaine.png', 999.99),
                                                            ('Air Occitanie', 'Découvrez les paysages méditerranéens et les montagnes des Pyrénées de la région Occitanie', 'img/Bouteille_Occitanie.png', 749.99),
                                                            ('Air Pays de la Loire', 'Respirez l''air iodé des côtes vendéennes et des châteaux de la Loire', 'img/Bouteille_PdlL.png', 99.99),
                                                            ('Air Provence Alpes Côte d''Azur', 'Évadez-vous sur les plages de la Côte d''Azur et les montagnes des Alpes du Sud', 'img/Bouteille_PACA.png', 4999.99);
## Intérêt de déporter la configuration des micro-services ?
Déporter la configuration des micro-services a plusieurs intérêts.
- Cela permet de centraliser la configuration de tous les microservices au même endroit, ce qui facilite la gestion et la maintenance des différentes configurations.
- Cela permet de modifier la configuration d'un micro-service à chaud, sans avoir à redéployer l'application.

## Intérêt d’Eureka dans ce projet ?
Eureka est un service de registre et de découverte de services.
- Ici, il permet aux micro-services de s'enregistrer et de se découvrir automatiquement.
- Les micro-services n'ont plus besoin de connaître les adresses IP et les ports des autres micro-services.
- Il manque ici tout de même une étape pour faire de la répartition de charge qui utiliserait Eureka pour connaitre les services nécessaires.

## Intérêt de l’api gateway Zuul dans ce projet ?
- Simplifier l'accès aux micro-services pour les clients UI et les autres micro-services
- Permet de masquer la complexité des différents micro-services en fournissant une interface unique et simplifiée
- Permet de sécuriser l'accès aux micro-services en implémentant des règles de filtrage et d'authentification
- Permet d'améliorer les performances des micro-services en implémentant des stratégies de cache et de compression.

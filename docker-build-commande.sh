#!/bin/bash
#Stop spring-order-1 & spring-order-2 containers
docker-compose down spring-order-1 spring-order-2
docker-compose up -d --build spring-order-1 spring-order-2
docker image prune -f  # Supprime les images sans tag automatiquement
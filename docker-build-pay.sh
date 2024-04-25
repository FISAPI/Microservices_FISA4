#!/bin/bash
#Stop spring-pay-1 & spring-pay-2 containers
docker-compose down spring-pay-1 spring-pay-2
docker-compose up -d --build spring-pay-1 spring-pay-2
docker image prune -f  # Supprime les images sans tag automatiquement
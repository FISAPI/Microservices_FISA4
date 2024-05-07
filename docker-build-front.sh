#!/bin/bash
#Stop spring-pay-1 & spring-pay-2 containers
docker-compose down vue-front
docker-compose up -d --build vue-front
docker image prune -f  # Supprime les images sans tag automatiquement
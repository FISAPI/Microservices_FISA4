#!/bin/bash
docker-compose down
docker-compose up -d --build
docker image prune -f  # Supprime les images sans tag automatiquement
#!/bin/bash
docker image prune -f  # Supprime les images sans tag automatiquement
docker-compose up -d --build
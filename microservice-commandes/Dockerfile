# Étape de build
FROM maven:3.8.4-openjdk-17 as build

# Créer un répertoire pour le cache Maven et déclarer un volume
VOLUME ["/root/.m2"]

# Copie du pom.xml et téléchargement des dépendances
COPY pom.xml .
RUN mvn dependency:go-offline

# Copie des sources
COPY src ./src

# Compilation du projet et skip des tests
RUN mvn clean package -DskipTests

# Étape finale pour l'exécution
FROM openjdk:17

# Copie du jar construit à l'étape de build
COPY --from=build /target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
# Usamos Java 21
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copiamos el archivo .jar compilado
COPY target/*.jar app.jar

# Copiamos la carpeta del wallet al contenedor para que Oracle conecte
COPY wallet/ /app/wallet/

# Exponemos el puerto ajustado
EXPOSE 8088

# Ejecutamos
ENTRYPOINT ["java", "-jar", "app.jar"]
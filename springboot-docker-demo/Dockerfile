FROM eclipse-temurin:17
LABEL mentainer="avanishmnit@gmail.com"
EXPOSE 8080
WORKDIR /app
COPY target/springboot-docker-demo-0.0.1-SNAPSHOT.jar /app/springboot-docker-demo.jar
ENTRYPOINT ["java","-jar" , "springboot-docker-demo.jar"]
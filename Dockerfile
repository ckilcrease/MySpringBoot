FROM openjdk:8-alpine

WORKDIR /app

COPY . .

CMD ["java", "-jar" , "/app/MySpringBoot-1.0-SNAPSHOT.jar"]


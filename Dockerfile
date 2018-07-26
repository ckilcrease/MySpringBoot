FROM openjdk:8-alpine AS build

WORKDIR MySpringBoot

COPY . .

FROM openjdk:8-alpine

WORKDIR MySpringBoot


COPY --from=build /app/target/MySpringBoot-1.0-SNAPSHOT.jar .

CMD ["java", "-jar" , "/app/MySpringBoot-1.0-SNAPSHOT.jar"]


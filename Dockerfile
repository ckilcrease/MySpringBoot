FROM openjdk:8-alpine AS build

WORKDIR MySpringBoot

COPY . .

FROM openjdk:8-alpine

WORKDIR MySpringBoot


COPY --from=build /app/target/MySpringBoot-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar" , "/app/MySpringBoot-0.0.1-SNAPSHOT.jar"]


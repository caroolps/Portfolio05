FROM maven:3.6.3-jdk-11-slim

WORKDIR /usr/app

COPY . .

RUN mvn clean install -DskipTests

CMD mvn spring-boot:run

# FROM openjdk:11
# ADD target/user-mysql.jar user-mysql.jar
# EXPOSE 8081
# ENTRYPOINT ["java", "-jar", "user-mysql.jar"]


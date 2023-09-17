FROM openjdk:17
LABEL version=1.0
LABEL description="It's an Java Img with springboot. The RDS is in AWS"
WORKDIR /usr/src/myapp/
COPY ./target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]


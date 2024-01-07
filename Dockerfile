FROM container-registry.oracle.com/java/jdk:17.0.9
COPY /target/createservice.jar home/createservice.jar
ENTRYPOINT java -jar home/createservice.jar

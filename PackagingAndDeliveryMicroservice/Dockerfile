# define base docker image
FROM openjdk:8
LABEL maintainer="piraneshs"
ADD target/packageDeliveryMicroservice-0.0.1-SNAPSHOT.jar package-delivery-microservice.jar
ENTRYPOINT ["java", "-jar", "package-delivery-microservice.jar"]
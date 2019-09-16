FROM openjdk:8
MAINTAINER Vinod <vinod@vinod.co>
ADD target/service-two.jar service-two.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=4500", "-DEUREKA_URI=http://13.235.144.200:8761/eureka", "/service-two.jar"]
EXPOSE 4500
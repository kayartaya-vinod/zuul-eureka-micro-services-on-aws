FROM openjdk:8
MAINTAINER Vinod <vinod@vinod.co>
ADD target/service-one.jar service-one.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=3500", "-DEUREKA_URI=http://13.235.144.200:8761/eureka", "/service-one.jar"]
EXPOSE 3500
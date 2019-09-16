FROM openjdk:8
MAINTAINER Vinod <vinod@vinod.co>
ADD target/eureka-server-demo.jar eureka-server-demo.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=8761", "/eureka-server-demo.jar"]
EXPOSE 8761
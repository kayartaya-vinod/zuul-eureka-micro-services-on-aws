FROM openjdk:8
MAINTAINER Vinod <vinod@vinod.co>
ADD target/zuul-demo.jar zuul-demo.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=5500", "-DEUREKA_URI=http://13.235.144.200:8761/eureka", "/zuul-demo.jar"]
EXPOSE 5500
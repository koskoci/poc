FROM openjdk:11.0.1-jdk-slim
LABEL maintainer="koskoci.balazs@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/poc-0.0.2-SNAPSHOT.jar
ADD ${JAR_FILE} poc.jar
ENTRYPOINT ["java","-jar","/poc.jar"]

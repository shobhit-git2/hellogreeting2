FROM openjdk:8-jre-alpine

USER root

ADD ./target/*.jar /opt/HelloGreeting-0.0.1-SNAPSHOT.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/HelloGreeting-0.0.1-SNAPSHOT.jar"]
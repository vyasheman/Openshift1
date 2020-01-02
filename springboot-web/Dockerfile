#From tomcat:8.0.51-jre8-alpine
#RUN rm -rf /usr/local/tomcat/webapps/*
#COPY ./target/springboot-web-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
#RUN  chmod 777 -R /usr/local/tomcat/webapps/ROOT.war
#CMD ["catalina.sh","run"]

FROM openjdk:8
ADD target/springboot-web-0.0.1-SNAPSHOT.jar springboot-web-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "springboot-web-0.0.1-SNAPSHOT.jar"]
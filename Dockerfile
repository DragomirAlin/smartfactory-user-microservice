FROM openjdk:latest
 
COPY target/*.jar /srv/

COPY docker-entrypoint.sh /

EXPOSE 8001

ENTRYPOINT ["java","-jar","/srv/user.management-0.0.1-SNAPSHOT.jar"]


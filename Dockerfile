FROM openjdk
COPY "./build/libs/devopsDemo-0.0.1-SNAPSHOT.jar" app/DevopsDemo/
WORKDIR app/DevopsDemo/
EXPOSE 8085
ENTRYPOINT ["java", "-jar","devopsDemo-0.0.1-SNAPSHOT.jar"]
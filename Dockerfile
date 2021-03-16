FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/OrderMS.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8400
ENV JAVA_OPTS=""
RUN sh -c "touch OrderMS.jar"
ENTRYPOINT [ "java", "-jar", "OrderMS.jar" ]

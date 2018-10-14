FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xmx64M","-Xss256k", "-Xms32m", "-XX:NativeMemoryTracking=summary","-jar","/app.jar"]
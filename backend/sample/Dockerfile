FROM openjdk:21

ENV APP=sample.jar
ENV BUILD_DIR=build/libs
ENV OPTIONS=""

COPY $BUILD_DIR/sample-0.0.1-SNAPSHOT.jar $APP

EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java $OPTIONS -jar $APP"]

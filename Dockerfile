FROM openjdk:11
ARG JAR_FILE=build/libs/gpsutil-1.0.0.jar
ADD ${JAR_FILE} gpsutil.jar
ENTRYPOINT ["java","-jar","/gpsutil.jar"]



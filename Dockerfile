FROM frolvlad/alpine-oraclejdk8
MAINTAINER Pradeep <k_pradeep@live.com>
ADD build/libs/spring-cloud-config-server-0.0.1-SNAPSHOT.jar cloud-config-ms.jar
ENTRYPOINT ["java", "-jar", "/cloud-config-ms.jar"]
EXPOSE 8888
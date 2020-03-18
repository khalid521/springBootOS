FROM alpine-java:base
COPY traget/demo-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar"]
EXPOSE 8888
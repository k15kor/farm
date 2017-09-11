FROM java:8u111

COPY build/libs/*.jar /opt/eureka.jar

EXPOSE 8761

ENTRYPOINT ["/usr/bin/java"]

CMD ["-jar", "/opt/eureka.jar"]

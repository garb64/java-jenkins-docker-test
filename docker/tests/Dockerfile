FROM ubuntu:14.04

MAINTAINER garb64

# Java, maven
RUN apt-get update && \
    apt-get install -y --force-yes --no-install-recommends openjdk-7-jdk maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Create directory for sources
RUN mkdir /source
WORKDIR /source
CMD mvn test
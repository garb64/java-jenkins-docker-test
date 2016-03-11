# java-jenkins-docker-test
Java project for testing jenkins and docker integration

This project is for testing of the concepts of Victor Farcic "Automating the Continuous Deployment Pipeline with Containerized Microservices"

Jenkins will execute the following steps:
- git clone 
- docker build -t tag-for-this-project docker/tests
- docker push tag-for-this-project <url to the docker registry>
- docker run

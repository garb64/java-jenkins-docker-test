# java-jenkins-docker-test
Java project for testing jenkins and docker integration

This project is for testing of the concepts of Victor Farcic "Automating the Continuous Deployment Pipeline with Containerized Microservices"

Jenkins will execute the following steps:
- git clone https://github.com/garb64/java-jenkins-docker-test.git
- docker build -t java-jenkins-docker-test docker/tests
- docker push localhost:5000/java-jenkins-docker-test
- docker run -v $PWD:/source -v /data/.m2:/root/.m2 localhost:5000/java-jenkins-docker-test

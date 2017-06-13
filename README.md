# java-docker-compose-remote-debug

- Java-8
- Spring-Boot
- Spring-Data-JPA
- Postgres
- Docker
- Docker-Compose
- Docker-Debug

```shell 
./gradlew clean build && docker build -f docker/Dockerfile -t java-docker-compose-remote-debug . && docker-compose -f docker/docker-compose.yml up

```
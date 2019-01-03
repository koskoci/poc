# poc
Containerized Java Spring Boot Proof of Concept

## Overview
This is a proof-of-concept app to see how easy / complicated it is to put together a basic microservices architecture in Java Spring Boot and Docker. There are 3 identical Java microservice instances, all talking to the same, persistent Redis database.

## Usage Instructions
It is sufficient to install Docker - no need to install Java nor Redis. Also, there is no need to clone the repo.

Download the `docker-compose.yml` file only and run `docker-compose up -d`. Data will be persisted locally in `./redis-data/dump.rdb`.

## Stopping the app
`docker-compose down`

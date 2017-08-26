# Hands On Lab

This api is for MobileSeatReservation.

## Prerequisites

We need swagger-codegen to generate springboot source codes for the API

You can refer to [Install Swagger Codegen](https://github.com/swagger-api/swagger-codegen#compatibility)

If you are a Mac user
```
brew install swagger-codegen
```
Otherwise,
```
wget http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.3/swagger-codegen-cli-2.2.3.jar -O swagger-codegen-cli.jar

java -jar swagger-codegen-cli.jar help
```

## clone git 

```
$ git clone https://github.com/credemol/api-first-strategy.git
```

You can find a file named swagger-msr.yaml

In order to avoid duplication, I recommand you create a new directory 

```
$ mkdir my-api-first
$ copy api-first-strategy/swagger-msr.yaml my-api-first/
$ cd my-api-first

$ swagger-codegen generate -v -i "swagger-msr.yaml" \
 -l "spring" -o "acme-msr-api" \
 --api-package "com.acme.msr.api" \
 --model-package "com.acme.msr.model" \
 --model-name-suffix "VO" \
 --artifact-id "acme-msr-api" \
 --group-id "com.acme.msa

 $ cd acme-msr-api
 $ mvn clean package
 $ mvn spring-boot:run
```

## create s
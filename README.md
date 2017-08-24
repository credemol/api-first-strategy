# api-first-strategy

## generate springboot project from swagger-petstore.yaml
```
swagger-codegen generate -v -i swagger-petstore.yaml -l spring -o swagger-petstore-springboot --api-package com.acme.petstore.api --model-package com.acme.petstore.model --artifact-id acme-petstore --group-id com.acme.msa
```

## add .gitignore file to swagger-petstore-springboot directory

### .gitignore
The content of '.gitingore' file came from a project created by STS

```
target/
!.mvn/wrapper/maven-wrapper.jar

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
nbproject/private/
build/
nbbuild/
dist/
nbdist/
.nb-gradle/
```

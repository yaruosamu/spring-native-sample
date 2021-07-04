# spring-native-sample

This is a sample to try [Spring Native](https://github.com/spring-projects-experimental/spring-native).
This sample includes simple Spring Boot web app and builds GraalVM native application by Spring Native.

> NOTE: 
> This sample uses Spring Native 0.10.1(Beta).
> Now Spring Native supports spring-boot-starter-web, spring-boot-starter-thymeleaf, spring-boot-starter-data-jpa and more.
> This sample aims to confirm support for these libraries. 

## Environments

* Apache Maven 3.8.1
* SDKMAN 5.11.6
  * GraalVM 21.1.0
* PostgreSQL 12.7

## How to Use

### Prerequirements

Install and Setting Apache Maven, SDKMAN and PostgreSQL.

### Database Setting

Add PostgreSQL JDBC setting into `src/main/resources/application.properties`.
Replace `${XXX}` with the values that suits your environment.

```
spring.jpa.database=POSTGRESQL
spring.datasource.url=jdbc:postgresql://localhost:5432/${YOUR_DB_NAME}
spring.datasource.username=${YOUR_USER_NAME}
spring.datasource.password=${YOUR_PASSWORD}
```

Create database & table and insert test data into PostgeSQL.

> NOTE: 
> Table name must be 'data'.

```
CREATE DATABASE ${YOUR_DB_NAME};

CREATE TABLE data (
     id VARCHAR(100) NOT NULL,
     name TEXT NOT NULL,
     description TEXT NOT NULL,
     PRIMARY KEY(id)
);

INSERT INTO data VALUES(1, 'any name1', 'any description1');
INSERT INTO data VALUES(2, 'any name2', 'any description2');
...
```

### GraalVM Setting

Get GraalVM binary by SDKMAN

```
sdk install java 21.1.0.r11-grl
sdk use java 21.1.0.r11-grl
gu install native-image
```

### Build Application and Compile Native Image

```
mvn -Pnative -DskipTests package
```

### Run Native Application

```
target/Spring-Native-Sample
```

After launching Spring Application, you will check sample web page at [localhost:8080](http://localhost:8080/).
This page shows test data list inserted into DB.

## References

* [Spring Native documentation](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

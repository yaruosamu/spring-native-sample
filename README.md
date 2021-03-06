# spring-native-sample

This is a sample to try [Spring Native](https://github.com/spring-projects-experimental/spring-native).
This sample includes simple Spring Boot web app and builds GraalVM native application by Spring Native.

> NOTE: 
> This sample uses Spring Native 0.10.3(Beta).
> Now Spring Native supports spring-boot-starter-web, spring-boot-starter-thymeleaf, spring-boot-starter-data-jpa and more.
> This sample aims to confirm support for these libraries. 

## Environments

* Apache Maven 3.8.1
* SDKMAN 5.12.4
  * GraalVM 21.2.0 (Based on Java 11)
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

Sample data is inserted when Spring Boot initialization.
They are defined in `src/main/resources/data.sql`

### GraalVM Setting

Get GraalVM binary by SDKMAN

```
sdk install java 21.2.0.r11-grl
sdk use java 21.2.0.r11-grl
gu install native-image
```

### Build Application and Compile Native Image

```
mvn -Pnative package
```

### Run Native Application

```
target/Spring-Native-Sample
```

After launching Spring Application, you will check sample web page at [localhost:8080](http://localhost:8080/).
This page shows test data inserted into DB.

## References

* [Spring Native documentation](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

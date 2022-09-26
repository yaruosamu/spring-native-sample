# spring-native-sample

Here is a sample for testing [Spring Native](https://github.com/spring-projects-experimental/spring-native).
This sample is a simple Spring Boot web app and be built to a native application with GraalVM CE 21.1.0 and Spring Native 0.12.1(beta).

## Environments

* Apache Maven 3.8.1
* docker 20.10.17
  * docker compose plugin 2.10.2

## How to Use

There are 2 ways to build and launch a native app.
One is on container, the other is on host.

### Native apps on container

First, build native app and container with cloud native buildpacks.

```
$ mvn spring-boot:build-image
```

Next, run containers which includes native apps and postgres.

```
$ docker compose up -d
```

After running containers, you will check sample web page at [localhost:8080](http://localhost:8080/).
This page shows test data that Maven dependencies list inserted into DB

You can stop containers by:

```
$ docker compose down
```

### Native apps on host

#### Database Setting

Your host needs postgresql to lauch app.
I recomend to use PostgreSQL container.

```
$ docker run --rm  -e POSTGRES_USER=test -e POSTGRES_PASSWORD=testtest -e POSTGRES_DB=test -p 5432:5432 -d postgres
```

Next, rewrite PostgreSQL JDBC connection setting in `src/main/resources/application.properties` to use localhost port 5432.
In short, replace 'sprint.datasource.url' value from `db:5432` to `localhost:5432`.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/test
```

#### GraalVM Setting

You needs GraalVM and native-image tool.
An easy way to get GraalVM is to use SDKMAN.
After install SDKMAN, you can install by the following.

```
$ sdk install java 22.1.0.r11-grl
$ sdk use java 22.1.0.r11-grl
$ gu install native-image
```

Some more package need to be installed.
See [here](https://www.graalvm.org/22.1/reference-manual/native-image/#prerequisites) for details.

#### Build Application and Compile Native Image

```
$ mvn -Pnative package
```

#### Run Native Application

```
$ target/spring-native-app-0.12.1
```

After native app, you will check sample web page at [localhost:8080](http://localhost:8080/).

## References

* [Spring Native documentation](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

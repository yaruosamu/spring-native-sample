DROP TABLE IF EXISTS data;

CREATE TABLE data (
     id VARCHAR(100) NOT NULL,
     name TEXT NOT NULL,
     description TEXT NOT NULL,
     PRIMARY KEY(id)
);

INSERT INTO data VALUES(1, 'spring-boot-starter-data-jpa', 'Starter for using Spring Data JPA with Hibernate' );
INSERT INTO data VALUES(2, 'spring-boot-starter-thymeleaf', 'Starter for building MVC web applications using Thymeleaf views');
INSERT INTO data VALUES(3, 'spring-boot-starter-web', 'Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container');
INSERT INTO data VALUES(4, 'spring-native', 'Spring Native' );
INSERT INTO data VALUES(5, 'postgresql', 'BSD PostgreSQL JDBC Driver Postgresql ');
INSERT INTO data VALUES(6, 'lombok', 'Spice up your java: Automatic Resource Management, automatic generation of getters, setters, equals, hashCode and toString, and more!');
INSERT INTO data VALUES(7, 'bootstrap', 'WebJar for Bootstrap' );

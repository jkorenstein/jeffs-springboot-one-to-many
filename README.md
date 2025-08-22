## From: Spring Boot One To Many example with JPA, Hibernate

https://www.bezkoder.com/jpa-one-to-many/

Jeff Aug 2025

to run:

cd /Users/jeffkorenstein/dev/learning/jeffs-springboot-one-to-many/demo (or correct folder)

```
mvn clean install

cd target

java -jar demo-0.0.1-SNAPSHOT.jar
```

or

```
mvn clean install
java -jar ./target/demo-0.0.1-SNAPSHOT.jar
```

then in browser:

to see database: http://localhost:8080/h2-ui/ (url = jdbc:h2:mem:jeff-springboot-one-to-many)

to hit endpoint: http://localhost:8080/api/tutorials

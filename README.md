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

to hit endpoint: 

tutorials:
- http://localhost:8080/api/tutorials or 
- http://localhost:8080/api/tutorials/1 or
- http://localhost:8080/api/tutorials/published

comments:
- http://localhost:8080/api/tutorials/1/comments
- http://localhost:8080/api/comments/1001  (not working yet)

to enter data into the H2 database:
```
INSERT INTO TUTORIALS VALUES(1,'here are a bunch of details about the tutorial', true, 'test tutorial 1');
INSERT INTO TUTORIALS VALUES(2,'here are some details about a different tutorial', false, 'test tutorial 2');
SELECT * FROM TUTORIALS;
INSERT INTO COMMENTS VALUES(1001, 'I loved this tutorial!', 1);
INSERT INTO COMMENTS VALUES(1002, 'I hated this tutorial!', 1);
INSERT INTO COMMENTS VALUES(1003, 'This tutorial was meh!', 2);
SELECT * FROM COMMENTS;
```


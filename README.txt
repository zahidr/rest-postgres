I call this type of application a prototyping.
Prototyping helps me master the technology concepts.
The fact I am cross-training and not a beginner, it is likely I will find unreported Bugs.
https://github.com/OpenLiberty/open-liberty/issues/21547

To run application:

setup Postgres database as per server.xml
and create_table.sql , populate_book.sql

mvn clean package
mvn liberty:dev
http://localhost:9080/openapi/ui/

com.demo.rest.providers.CorsFilter.java #is not needed for this app


To run application:

setup Postgres database as per server.xml
and create_table.sql , populate_book.sql

mvn clean package
mvn liberty:dev
http://localhost:9080/openapi/ui/

com.demo.rest.providers.CorsFilter.java is not needed for app

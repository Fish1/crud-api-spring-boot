# Country CRUD API - Spring Boot

This is a simple Spring Boot application that provides a REST API for creating a list of countries.

## Create a country

```
POST http://localhost:8080/countries
Content-Type: application/json

{
  "name": "United States",
}
```

## Retrieve countries
Single country
```
GET http://localhost:8080/countries/1
```
All countries
```
GET http://localhost:8080/countries
```

## Update a country
```
PUT http://localhost:8080/countries/1
Content-Type: application/json

{
  "name": "United States of America",
}
```

## Delete a country
```
DELETE http://localhost:8080/countries/1
```

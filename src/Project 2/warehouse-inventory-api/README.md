## Warehouse management API

This program is designed to serve as the back end functionality allowing companies to create, review, update, 
and delete their current and future shipping and receiving. 

## How to use:

utilize the designated endpoints to issue requests:
http://localhost:8080

GET /warehouses – retrieves all warehouses

GET /warehouses/id – retrieves data on the warehouse

GET /products – retrieves all products

GET /products/id – retrieves products by product id

POST /products – creates a new product entry in the database

PUT /products/id – updates product entry in the database

DELETE /products/id – deletes product entry in the database

## Current functionality
In its current build this API successfully issues GET requests for:
- all warehouses
- warehouse locations by ID
- all inventory products
- inventory products by ID
- deletes products by ID

## Upcoming updates
- PUT and POST functionality to create or update warehouse locations and products
- adding user authentication and permissions
- database triggers to dynamically adjust capacity as products are added or removed
- customer and transaction tables to database
- more detailed product descriptions

## Dependency Management

This api was built and hosted on a MySQL database
- schema and SQL files may be found in the sql-scripts file

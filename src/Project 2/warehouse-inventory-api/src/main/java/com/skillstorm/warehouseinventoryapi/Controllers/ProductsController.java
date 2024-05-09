// inventory Controller will take GET requests to display current inventory stock
// get request to get inventory by ID
//Post requests to add inventory received
// PUT requests to update quantity after being sold
// DELETE requests to remove discontinued items


package com.skillstorm.warehouseinventoryapi.Controllers;

import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

// add reqiest mapping at top of class and then use @ post mappping on methods
// set path variable on the @request mapping so that all @post mapping point to the same path
// week 8 day 3 < 1:22

@RestController
public class ProductsController {

    // gets all products
    @GetMapping("/products")
    public String getMethodName(@RequestParam(required = false) String param) {
        return new String();
    }

    // gets an individual product
    @GetMapping("/products/{id}")
    public String getItem(@RequestParam(required = false) String param) {
        return new String();
    }

    // adds a new product
    @PostMapping("/products")
    public String addProducts(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    // updates an existing product i.e quantity
    @PutMapping("/products/{id}")
    public String changeProducts(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    // @DeleteMapping

    // how to add delete request?

}

// inventory Controller will take GET requests to display current inventory stock
// get request to get inventory by ID
//Post requests to add inventory received
// PUT requests to update quantity after being sold
// DELETE requests to remove discontinued items

package com.skillstorm.warehouseinventoryapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.warehouseinventoryapi.models.Products;
import com.skillstorm.warehouseinventoryapi.services.ProductsService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

// add reqiest mapping at top of class and then use @ post mappping on methods
// set path variable on the @request mapping so that all @post mapping point to the same path
// week 8 day 3 < 1:22

@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductsService productsService;

    // constructor
    // @Autowired
    public ProductsController(ProductsService productsService){ // no autowired needed
        this.productsService = productsService; 
    }

    // gets all products
    @GetMapping("/products") // what should this mapping be, products also?
    public List<Products> getAllProducts(@RequestParam(required = false) String param) {
        return productsService.getAllProducts();

    }

    // gets an individual product
     @GetMapping("/{id}")
     public Products eachProducts(String id) {
         return productsService.findProduct(id);
     }

    // adds a new product
    @PostMapping("/products")
    @ResponseStatus(code = HttpStatus.CREATED) // why this?
    public Products createProduct(@Valid @RequestBody Products product) {
        
        return product ; // return type needs to return product data
    }

    // updates an existing product i.e quantity
    @PutMapping("/products/{id}")
    public String changeProducts(@PathVariable String id, @RequestBody String entity) {
        // TODO: process PUT request

        return entity;
    }

// DELETE reqeust to remove Product by ID
     @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK) // what needs to be fixed - not on Ericas code?
    public Products deleteProduct(@PathVariable Products id) { // can I do it this way or need to be an int?
        return null; // return list of current Products
    }

}

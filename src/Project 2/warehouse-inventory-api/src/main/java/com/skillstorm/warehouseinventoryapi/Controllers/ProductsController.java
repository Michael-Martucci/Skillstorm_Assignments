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
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

// set path variable on the @request mapping so that all @post mapping point to the same path
// week 8 day 3 < 1:22

@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductsService productsService;

    // constructor
    public ProductsController(ProductsService productsService){ // no autowired needed
        this.productsService = productsService; 
    }

    // gets all products
    @GetMapping("/products") // what should this mapping be, products also?
    @ResponseStatus (code = HttpStatus.OK)
    public List<Products> findAllProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return productsService.findAll();
        }else {
            return findbyName(name);
        }  

    }

    private List<Products> findbyName(String name) {
        return productsService.findByName(name);
    }

    // gets an individual product
     @GetMapping("/{id}")
    public Optional <Products> productData(int id) { // handle edge case ? Response entity?
        return productsService.findbyId(id); 
    }
     

    // adds a new product
    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED) // null check
    public Products createProduct(@Valid @RequestBody Products product) {
        
        return productsService.create(product); 
    }

    // updates an existing product i.e quantity
    @PutMapping("/{id}")
    public Products updateProducts(@PathVariable int id, @RequestBody Products product){
        return productsService.update(id, product);
    }

// DELETE reqeust to remove Product by ID
     @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT) 
    public void deleteProduct(@PathVariable int id) { 
        productsService.deleteById(id);
    }
}


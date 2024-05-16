// inventory Controller will take GET requests to display current inventory stock

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


@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductsService productsService;

    // constructor
    public ProductsController(ProductsService productsService) { // no autowired needed
        this.productsService = productsService;
    }

    // gets all products
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Products> findAllProducts(@Valid @RequestParam(required = false) String name) {
        if (name == null) {
            return productsService.findAll();
        } else {
            return productsService.findByName(name); // edge case for branch name in endpoint
        }

    }

    // gets an individual product
    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<Products> productData(@PathVariable int id) { 
        return productsService.findbyId(id);
        
    }

    // adds a new product
    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Products createProduct(@Valid @RequestBody Products product) {
        return productsService.createItem(product);
    }

    // updates an existing product i.e quantity
    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Products updateProducts(@Valid @PathVariable int id, @RequestBody Products product) {

        return productsService.updateItem(product);
    }

    // DELETE reqeust to remove Product by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT) // add authorization
    public void deleteProduct(@Valid @PathVariable int id) {
        productsService.deleteById(id);
    }
}

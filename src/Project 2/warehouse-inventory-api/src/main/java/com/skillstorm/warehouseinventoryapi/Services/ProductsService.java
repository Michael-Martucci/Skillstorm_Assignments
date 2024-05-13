package com.skillstorm.warehouseinventoryapi.services;

import java.util.Arrays;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.warehouseinventoryapi.models.Products;
import com.skillstorm.warehouseinventoryapi.repos.ProductsRepo;


@Service
public class ProductsService {

     private final ProductsRepo repo; //?

    // @Autowired // constructor dependency - unused?
    public ProductsService(ProductsRepo repo) {
        this.repo = repo;
    }


    // instance to return list of all branches
    private List<Products> products = Arrays.asList(
        new Products(001, "copper_roll_3x500ft", 20, 80),
        new Products(002, "copper_roll_2x250ft", 10, 65),
        new Products(002, "copper_roll_18in", 40, 80),
        new Products(004, "lead_coat_copper_3x8", 20, 80));

    // method to return list of branches
    public List<Products> getAllProducts() {
        return products;
    }


// method to find product by ID
public Products findProduct(String id) { // java brains code
    // variable
return products.stream().filter(t -> t.getProduct_name().equals(id)).findFirst().get();
}


// call repo method on these? and make transactional?
    public Products findbyId(int id) {
        return null; // returns Product details by ID
    }

    public Products findbyName(String name) {
        return null; // return Products details by name
    }

    public List<Products>  findAll() {
        return repo.findAll(); // return all Products
    }

    public Products create(Products newProduct) {
        return newProduct; // returns newly created Product (details)
    }

    public Products update(Products product, int id) {
        return product; // returns updated product (details)
    }

    public void deleteById(int id) { // removes product by ID
        
    }
}

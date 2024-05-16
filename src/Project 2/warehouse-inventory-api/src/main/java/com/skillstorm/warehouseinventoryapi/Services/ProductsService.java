package com.skillstorm.warehouseinventoryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.warehouseinventoryapi.models.Products;
import com.skillstorm.warehouseinventoryapi.repos.ProductsRepo;

@Transactional // spring framework annotation or jakarta?
@Service
public class ProductsService {

    private final ProductsRepo repo;

    public ProductsService(ProductsRepo repo) {
        this.repo = repo;
    }

    // return all Products
    public List<Products> findAll() {
        return repo.findAll();
    }
    // find Product by name
    public List<Products> findByName(String name) {
        return repo.findByName(name);
    }
    // returns Product details by ID
    public Optional<Products> findbyId(int id) {
        if (!repo.existsById(id))
            throw new IllegalArgumentException("No product with id " + id + " exists");
        return repo.findById(id);
    }
    // creates new Product
    public Products createItem(Products newProduct) {
        int maxCapacity = newProduct.getBranch().getMax_Capacity_Lbs();
        int usedCapacity = repo.sumWeightByLocation(newProduct.getBranch());
        int availableCapacity = maxCapacity - usedCapacity;
        if (newProduct.getWeight_lbs() < availableCapacity)
            return repo.save(newProduct); // saves & returns updated product
        else {
            throw new IllegalArgumentException(" This product will exceed warehouse capacity");
        }
    }

    // updates existing product
    public Products updateItem(Products updateProduct) { // does this need to be an int since by ID?
        int maxCapacity = updateProduct.getBranch().getMax_Capacity_Lbs();
        int usedCapacity = repo.sumWeightByLocation(updateProduct.getBranch());
        int availableCapacity = maxCapacity - usedCapacity;
        if (updateProduct.getWeight_lbs() < availableCapacity)
            return repo.save(updateProduct); // saves & returns updated product
        else {
            throw new IllegalArgumentException(" This product will exceed warehouse capacity");
        }

    }

    // removes product by ID
    public void deleteById(int id) {
        if (!repo.existsById(id))
            throw new IllegalArgumentException("No product with id " + id + " exists");
        repo.deleteById(id);

    }

}

package com.skillstorm.warehouseinventoryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.warehouseinventoryapi.models.Products;
import com.skillstorm.warehouseinventoryapi.repos.ProductsRepo;

@Transactional
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
    // alternative method to find by ID using Products type
    public Products getProductsById(int id){
        return repo.findById(id).orElse(null);
    }


    // creates new Product
    public Products createItem(Products newProduct) {
        int maxCapacity = newProduct.getBranch().getMax_Capacity_Lbs();
        int usedCapacity = repo.sumWeightByLocation(newProduct.getBranch().getStoreNum());
        int availableCapacity = maxCapacity - usedCapacity;
        if (newProduct.getWeight_lbs() < availableCapacity)
            return repo.save(newProduct); // saves & returns updated product
        else {
            throw new IllegalArgumentException(" This product will exceed warehouse capacity");
        }
    }

    // updates existing product
    public Products updateItem(Products product) { 
        Products existingProduct = repo.findById(product.getProduct_Id()).orElse(null);
            existingProduct.setName(product.getName());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setCost(product.getCost());
            existingProduct.setWeight_lbs(product.getWeight_lbs());
        int maxCapacity = product.getBranch().getMax_Capacity_Lbs();
        int usedCapacity = repo.sumWeightByLocation(product.getBranch().getStoreNum());
        int availableCapacity = maxCapacity - usedCapacity;
        if (product.getWeight_lbs() < availableCapacity)

            
            return repo.save(existingProduct); // saves & returns updated product
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

package com.skillstorm.warehouseinventoryapi.services;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.warehouseinventoryapi.models.Branch;
import com.skillstorm.warehouseinventoryapi.models.Products;
import com.skillstorm.warehouseinventoryapi.repos.ProductsRepo;


// make transactional?

@Service
public class ProductsService {

     private final ProductsRepo repo; //?

    // @Autowired // constructor dependency - unused?
    public ProductsService(ProductsRepo repo) {
        this.repo = repo;
    }

public List<Products>  findAll() {
    return repo.findAll(); // return all Products
}

public List <Products> findByName(String name) {
    return repo.findByName(name);
}

    public Optional <Products> findbyId(int id) {
        return repo.findById(id); // returns Product details by ID
    }

@Transactional
    public Products create(Products newProduct) {
        Branch branchObj = newProduct.getBranch();
        int currentCapacity = repo.countByBranchID(branchObj.getStoreNum());
            if (currentCapacity >= branchObj.getMax_Capacity_Lbs())
                throw new RuntimeException("Exceeds Branch Capacity");
        return newProduct;
    }

    public Products update(int id, Products product) {
        Optional<Products> currentItem = repo.findById(id); // add logic to update fields
        return repo.save(currentItem); // returns updated product
    }

    public void deleteById(int id) { // removes product by ID
        // check to make sure product ID exists
        // can this sepcify which branch to delete from? - unique ID for each Item at branch
        repo.deleteById(id);
        
    }

}

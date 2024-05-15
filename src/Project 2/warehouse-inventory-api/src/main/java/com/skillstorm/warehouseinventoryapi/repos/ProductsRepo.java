package com.skillstorm.warehouseinventoryapi.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



import com.skillstorm.warehouseinventoryapi.models.Products;

public interface ProductsRepo extends JpaRepository<Products, Integer>{

    // generated method
    List<Products> findByName(String name);

    // generated method
    Products save(Optional<Products> currentItem);

    // generated method
    int countByBranchID(int storeNum);

    

   

}

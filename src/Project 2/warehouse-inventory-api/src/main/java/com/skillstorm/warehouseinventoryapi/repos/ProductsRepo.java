package com.skillstorm.warehouseinventoryapi.repos;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import com.skillstorm.warehouseinventoryapi.models.Products;


public interface ProductsRepo extends JpaRepository<Products, Integer> {

    List<Products> findByName(String name);

    Products save(Optional<Products> currentItem);

    // custom query to calcuate sum of current inventory weight by branch - foreign
    // key = location_id
    
    @Query(value = "SELECT SUM(p.weight_lbs) AS totalWeight FROM Products p WHERE p.branch.storeNum=?1")
    Integer sumWeightByLocation(long id);

   

}

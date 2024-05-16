package com.skillstorm.warehouseinventoryapi.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skillstorm.warehouseinventoryapi.models.Branch;
import com.skillstorm.warehouseinventoryapi.models.Products;

public interface ProductsRepo extends JpaRepository<Products, Integer> {

    List<Products> findByName(String name);

    Products save(Optional<Products> currentItem);

    // custom query to calcuate sum of current inventory weight by branch - foreign
    // key = location_id
    @Query("SELECT p.locationId, SUM(p.weightLbs) AS totalWeight FROM Products p GROUP BY p.locationId")
    Integer sumWeightByLocation(Branch branch);

}

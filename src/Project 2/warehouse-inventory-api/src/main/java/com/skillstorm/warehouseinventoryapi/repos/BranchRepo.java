package com.skillstorm.warehouseinventoryapi.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skillstorm.warehouseinventoryapi.models.Branch;
import com.skillstorm.warehouseinventoryapi.models.NameCapacity;


public interface BranchRepo extends JpaRepository<Branch, Integer> {

   
    List<Branch> findByName(String name);

    
    Branch save(Optional<Branch> currentItem);

     // Non native Query
    @Query("SELECT name, max_capacity_lbs FROM Branch b") // capitolization on C?
    List <NameCapacity> findAllNameCapacities();
    // list of all names and max capacity 
    // perhaps should be available capacity and where is this being used?


}




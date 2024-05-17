package com.skillstorm.warehouseinventoryapi.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skillstorm.warehouseinventoryapi.models.Branch;



public interface BranchRepo extends JpaRepository<Branch, Integer> {

    // custom query to return branches with general information from GET request
    @Query("SELECT new com.skillstorm.warehouseinventoryapi.models.Branch(b.storeNum, b.name, b.address) FROM Branch b")
    List<Branch> findAllBranches();
   
   

    List<Branch> findByName(String name);

    
    Branch save(Optional<Branch> currentItem);


    Optional<Branch> findByStoreNum(int id);


}




package com.skillstorm.warehouseinventoryapi.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.skillstorm.warehouseinventoryapi.models.Branch;



public interface BranchRepo extends JpaRepository<Branch, Integer> {

   
    List<Branch> findByName(String name);

    
    Branch save(Optional<Branch> currentItem);


    Optional<Branch> findByStoreNum(int id);


}




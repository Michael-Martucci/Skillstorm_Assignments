package com.skillstorm.warehouseinventoryapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.warehouseinventoryapi.models.Branch;


public interface BranchRepo extends JpaRepository<Branch, Integer> {

}




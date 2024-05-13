package com.skillstorm.warehouseinventoryapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.warehouseinventoryapi.models.Products;

public interface ProductsRepo extends JpaRepository<Products, Integer>{

}

package com.skillstorm.warehouseinventoryapi.Services;

import java.util.Arrays;
import java.util.List;
import com.skillstorm.warehouseinventoryapi.Models.Products;
import org.springframework.stereotype.Service;


@Service
public class ProductsService {


    // instance to return list of all branches
    private List<Products> products = Arrays.asList(
        new Products(001, "copper_roll_3x500ft", 20, 80),
        new Products(002, "copper_roll_2x250ft", 10, 65),
        new Products(002, "copper_roll_18in", 40, 80),
        new Products(004, "lead_coat_copper_3x8", 20, 80));

    // method to return list of branches
    public List<Products> getAllProducts() {
        return products;
    }


// logic here for capacity of warehouses
public Products findProduct(String id) { // java brains code
    // variable
return products.stream().filter(t -> t.getProduct_name().equals(id)).findFirst().get();
}

}

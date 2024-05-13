// this model class is for the different types of inventory stored in each warehouse


package com.skillstorm.warehouseinventoryapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_Id;

    @Column(length = 30)
    @NotBlank(message = "Error: Name cannot be blank")
    private String product_Name;

    @Column
    @Min(value = 0, message = "Error: Quantity cannot be less than zero")
    private int quantity;

    @Column
    @Min(value = 0, message = "Error: Name cannot be blank")
    private int weight_lbs;

    // insert Foreign Key / Join

    // copper_roll_3x500ft_lbs;
    // copper_roll_2x250ft_lbs;
    // copper_roll_18in_lbs;
    // copper_sheet_2x6_lbs;
    // copper_sheet_3x8_lbs;
    // lead_coat_copper_3x8_lbs;
    // 1 - 2" pipe collar;
    // 3 - 4" pipe collar;
    // 1 1/2" copper roofing nails;
    // 1 3/4" copper roofing naiils;
    // 1/2" plywood;
    // 3/4" plywood;
    // GAF starter shingles;
    // GAF hip and ridge 2 bd_Sq;
    // IKO 3 tab shingles_3bd_Sq;
    // GAF Architectural shingles_3bd_Sq;
    // 1 1/2" coil nails Stainless;
    //1 3/4" coild nails Stainless;
    // Ice and H20 shield;
    // 15# felt;
    // 30# felt;
    // Ridge cap roll 50ft;

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    
public Products(){}


public Products(int product_Id, String product_name, int quantity, int weight_lbs) {
    this.product_Id = product_Id; // ? should this increment a variable
    this.product_Name = product_name;
    this.quantity = quantity;
    this.weight_lbs = weight_lbs;
}



public int getProduct_Id() {
    return product_Id;
}

public void setProduct_Id(int product_Id) {
    this.product_Id = product_Id;
}

public String getProduct_name() {
    return product_Name;
}

public void setProduct_name(String product_name) {
    this.product_Name = product_name;
}

public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public int getWeight_lbs() {
    return weight_lbs;
}

public void setWeight_lbs(int weight_lbs) {
    this.weight_lbs = weight_lbs;
}




}

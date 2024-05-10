// this model class is for the different types of inventory stored in each warehouse


package com.skillstorm.warehouseinventoryapi.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_Id;

    @Column(length = 30)
    private String product_Name;

    @Column
    private int quantity;

    @Column
    private int weight_lbs;

    // insert Foreign Key / Join

    // int copper_roll_3x500ft_lbs;
    // int copper_roll_2x250ft_lbs;
    // int copper_roll_18in_lbs;
    // int copper_sheet_2x6_lbs;
    // int copper_sheet_3x8_lbs;
    // int lead_coat_copper_3x8_lbs;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    
public Products(){}


public Products(int product_Id, String product_name, int quantity, int weight_lbs) {
    this.product_Id = product_Id;
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

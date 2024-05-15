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

    // insert Foreign Key
    // @ManyToOne
    @JoinColumn ( name = "location_Id")
    private Branch branch;

    
public Products(){}


public Products(int product_Id, String product_name, int quantity, int weight_lbs, Branch branch) {
    this.product_Id = product_Id; // ? should this increment a variable
    this.product_Name = product_name;
    this.quantity = quantity;
    this.weight_lbs = weight_lbs;
    this.branch = branch;
    
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


public Branch getBranch() {
    return branch;
}


public void setBranch(Branch branch) {
    this.branch = branch;
}



// public int getLocation_Id(){
//     return location_Id;
// }

// public void setLocation_Id(int location_Id){
//     this.location_Id = location_Id;
// }


// @Override
// public String toString() {
//     return "Products [product_Id=" + product_Id + ", product_Name=" + product_Name + ", quantity=" + quantity
//             + ", weight_lbs=" + weight_lbs + ", location_Id=" + location_Id + "]";
}


// @Override
// public int hashCode() {
//     final int prime = 31;
//     int result = 1;
//     result = prime * result + product_Id;
//     result = prime * result + ((product_Name == null) ? 0 : product_Name.hashCode());
//     result = prime * result + quantity;
//     result = prime * result + weight_lbs;
//     result = prime * result + location_Id;
//     return result;
// }


// @Override
// public boolean equals(Object obj) {
//     if (this == obj)
//         return true;
//     if (obj == null)
//         return false;
//     if (getClass() != obj.getClass())
//         return false;
//     Products other = (Products) obj;
//     if (product_Id != other.product_Id)
//         return false;
//     if (product_Name == null) {
//         if (other.product_Name != null)
//             return false;
//     } else if (!product_Name.equals(other.product_Name))
//         return false;
//     if (quantity != other.quantity)
//         return false;
//     if (weight_lbs != other.weight_lbs)
//         return false;
//     if (location_Id != other.location_Id)
//         return false;
//     return true;
// }






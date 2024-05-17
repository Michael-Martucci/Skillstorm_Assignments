// model class is for creating the different types of inventory to be stored in each warehouse

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
    private String name;

    @Column
    @Min(value = 0, message = "Error: Quantity cannot be less than zero")
    private int quantity;

    @Column
    @Min(value = 0, message = "Error: Name cannot be blank")
    private int weight_lbs;

    @Column
    @Min(value = 0, message = "Error: cost cannot be less than zero")
    private double cost;

    // Foreign Key
    @ManyToOne
    @JoinColumn(name = "location_Id")
    private Branch branch;

    // constructors
    public Products() {
    }

    public Products(int product_Id, @NotBlank(message = "Error: Name cannot be blank") String name,
            @Min(value = 0, message = "Error: Quantity cannot be less than zero") int quantity,
            @Min(value = 0, message = "Error: Name cannot be blank") int weight_lbs,
            @Min(value = 0, message = "Error: cost cannot be less than zero") double cost, Branch branch) {
        this.product_Id = product_Id;
        this.name = name;
        this.quantity = quantity;
        this.weight_lbs = weight_lbs;
        this.cost = cost;
        this.branch = branch;
    }


    // getters and setters
    public int getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // to string
    @Override
    public String toString() {
        return "Products [product_Id=" + product_Id + ", name=" + name + ", quantity=" + quantity + ", weight_lbs="
                + weight_lbs + ", cost=" + cost + ", branch=" + branch + "]";
    }

    // hash
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + product_Id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + quantity;
        result = prime * result + weight_lbs;
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((branch == null) ? 0 : branch.hashCode());
        return result;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Products other = (Products) obj;
        if (product_Id != other.product_Id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (quantity != other.quantity)
            return false;
        if (weight_lbs != other.weight_lbs)
            return false;
        if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
            return false;
        if (branch == null) {
            if (other.branch != null)
                return false;
        } else if (!branch.equals(other.branch))
            return false;
        return true;
    }

        

    

    
}

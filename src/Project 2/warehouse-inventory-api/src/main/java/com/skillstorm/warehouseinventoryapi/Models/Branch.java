// model class for building the different branch locations

package com.skillstorm.warehouseinventoryapi.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeNum;

    @Column(length = 30)
    @NotBlank(message = "Error: Name cannot be blank") // remove these validators - service class
    private String name;

    @Column(length = 30)
    @NotBlank(message = "Error: Please enter a valid address")
    private String address;

    @Column(length = 30)
    @NotBlank(message = "Error: Name cannot be blank")
    private String branchManager;

    @Column(length = 30) // this needs to be an int
    @NotBlank(message = "Error: Name cannot be blank")
    private int numOfEmployees;

    @Column
    @Min(value = 0)
    private int currentCapacity;

    @Column
    @Min(value = 0, message = "Error: Please enter a valid weight")
    private int max_Capacity_Lbs; // these will all be DB table fields

    // foreign key
    @OneToMany(mappedBy = "branch")
    @JsonIgnore
    List<Products> items;

    // constructors
    public Branch() {
    };

    public Branch(int storeNum, @NotBlank(message = "Error: Name cannot be blank") String name,
            @NotBlank(message = "Error: Please enter a valid address") String address,
            @NotBlank(message = "Error: Name cannot be blank") String branchManager,
            @NotBlank(message = "Error: Name cannot be blank") int numOfEmployees,
            @Min(value = 0, message = "Error: Please enter a valid weight") int max_Capacity_Lbs,
            List<Products> items) {
        this.storeNum = storeNum;
        this.name = name;
        this.address = address;
        this.branchManager = branchManager;
        this.numOfEmployees = numOfEmployees;
        this.max_Capacity_Lbs = max_Capacity_Lbs;
        this.items = items;
    }


    public Branch(int storeNum, String name, String address) {
        super();
        this.storeNum = storeNum;
        this.name = name;
        this.address = address;
    }


    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(int storeNum) {
        this.storeNum = storeNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMax_Capacity_Lbs() {
        return max_Capacity_Lbs;
    }

    public void setMax_Capacity_Lbs(int max_Capacity_Lbs) {
        this.max_Capacity_Lbs = max_Capacity_Lbs;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public List<Products> getItems() {
        return items;
    }

    public void setItems(List<Products> items) {
        this.items = items;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }


    // to string
    @Override
    public String toString() {
        return "Branch [storeNum=" + storeNum + ", name=" + name + ", address=" + address + ", branchManager="
                + branchManager + ", numOfEmployees=" + numOfEmployees + ", currentCapacity=" + currentCapacity
                + ", max_Capacity_Lbs=" + max_Capacity_Lbs + ", items=" + items + "]";
    }
    // hash
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + storeNum;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((branchManager == null) ? 0 : branchManager.hashCode());
        result = prime * result + numOfEmployees;
        result = prime * result + currentCapacity;
        result = prime * result + max_Capacity_Lbs;
        result = prime * result + ((items == null) ? 0 : items.hashCode());
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
        Branch other = (Branch) obj;
        if (storeNum != other.storeNum)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (branchManager == null) {
            if (other.branchManager != null)
                return false;
        } else if (!branchManager.equals(other.branchManager))
            return false;
        if (numOfEmployees != other.numOfEmployees)
            return false;
        if (currentCapacity != other.currentCapacity)
            return false;
        if (max_Capacity_Lbs != other.max_Capacity_Lbs)
            return false;
        if (items == null) {
            if (other.items != null)
                return false;
        } else if (!items.equals(other.items))
            return false;
        return true;
    }

    
}

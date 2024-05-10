// model class for building the different branch locations

package com.skillstorm.warehouseinventoryapi.Models;

import jakarta.persistence.*;


@Entity
@Table(name = "Branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeNum;

    @Column(length = 30)
    private String name;

    @Column(length = 30)
    private String address;

    @Column(length = 30)
    private String branchManager;

    @Column(length = 30)
    private String numOfEmployees;

    @Column
    private int max_Capacity_Lbs; // these will all be DB table fields

    // insert foreign key / join


    // constructors
    public Branch(){};

    public Branch(int storeNum, String name, String address, String branchManager, 
            String numOfEmployees, int max_Capacity_Lbs) {
        super();
        this.storeNum = storeNum;
        this.name = name;
        this.address = address;
        this.branchManager = branchManager;
        this.numOfEmployees = numOfEmployees;
        this.max_Capacity_Lbs = max_Capacity_Lbs;
    }

    public Branch(int storeNum, String name) {
        super();
        this.storeNum = storeNum;
        this.name = name;
        // address
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

    public String getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(String numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    // to string
    @Override
    public String toString() {
        return "Branch [storeNum=" + storeNum + ", name=" + name + ", address=" + address + ", branchManager="
                + branchManager + ", numOfEmployees=" + numOfEmployees + ", max_Capacity_Lbs=" + max_Capacity_Lbs + "]";
    }

    // override hash
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + storeNum;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((branchManager == null) ? 0 : branchManager.hashCode());
        result = prime * result + ((numOfEmployees == null) ? 0 : numOfEmployees.hashCode());
        result = prime * result + max_Capacity_Lbs;
        return result;
    }

    // override .equals
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
        if (numOfEmployees == null) {
            if (other.numOfEmployees != null)
                return false;
        } else if (!numOfEmployees.equals(other.numOfEmployees))
            return false;
        if (max_Capacity_Lbs != other.max_Capacity_Lbs)
            return false;
        return true;
    }

    
 
    

}

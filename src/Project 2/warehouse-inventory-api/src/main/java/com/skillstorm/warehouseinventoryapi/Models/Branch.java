// model class for building the different branch locations

package com.skillstorm.warehouseinventoryapi.Models;

public class Branch {

    private String name;
    private int storeNum;
    private String address;
    // private int max_Capacity_Lbs; // these will all be DB table fields
    // private String branchManager;
    // private String numOfEmployees;

    public Branch(){};

    public Branch(String name, int storeNum, String address) {
        super();
        this.name = name;
        this.storeNum = storeNum;
        this.address = address;
    }
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

    // to string
    @Override
    public String toString() {
        return "Branch [name=" + name + ", storeNum=" + storeNum + ", address=" + address + "]";
    }


    // override hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + storeNum;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Branch other = (Branch) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (storeNum != other.storeNum)
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        return true;
    }
 
    

}

// this model class is for the different types of inventory stored in each warehouse
// need to add ID to items
package com.skillstorm.warehouseinventoryapi.Models;

public class Inventory {

    String siding;
    String shingles;
    String windows;
    String doors;


    public Inventory(){}

    

    public Inventory(String siding, String shingles, String windows, String doors) {
        this.siding = siding;
        this.shingles = shingles;
        this.windows = windows;
        this.doors = doors;
    }



    public String getSiding() {
        return siding;
    }


    public void setSiding(String siding) {
        this.siding = siding;
    }


    public String getShingles() {
        return shingles;
    }


    public void setShingles(String shingles) {
        this.shingles = shingles;
    }


    public String getWindows() {
        return windows;
    }


    public void setWindows(String windows) {
        this.windows = windows;
    }


    public String getDoors() {
        return doors;
    }


    public void setDoors(String doors) {
        this.doors = doors;
    }


// to string
    @Override
    public String toString() {
        return "Inventory [siding=" + siding + ", shingles=" + shingles + ", windows=" + windows + ", doors=" + doors
                + "]";
    }


    // hash code over rdie
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((siding == null) ? 0 : siding.hashCode());
        result = prime * result + ((shingles == null) ? 0 : shingles.hashCode());
        result = prime * result + ((windows == null) ? 0 : windows.hashCode());
        result = prime * result + ((doors == null) ? 0 : doors.hashCode());
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
        Inventory other = (Inventory) obj;
        if (siding == null) {
            if (other.siding != null)
                return false;
        } else if (!siding.equals(other.siding))
            return false;
        if (shingles == null) {
            if (other.shingles != null)
                return false;
        } else if (!shingles.equals(other.shingles))
            return false;
        if (windows == null) {
            if (other.windows != null)
                return false;
        } else if (!windows.equals(other.windows))
            return false;
        if (doors == null) {
            if (other.doors != null)
                return false;
        } else if (!doors.equals(other.doors))
            return false;
        return true;
    }

    
    




}

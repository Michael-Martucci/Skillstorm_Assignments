// this model class is for the different types of inventory stored in each warehouse
// need to add ID to items
package com.skillstorm.warehouseinventoryapi.Models;

public class Products {

    // private int id;
    // private String name;
    // private String descritption;
    // private int quantity;
    // private int weight_lbs;

    int copper_roll_3x500ft_lbs;
    int copper_roll_2x250ft_lbs;
    int copper_roll_18in_lbs;
    int copper_sheet_2x6_lbs;
    int copper_sheet_3x8_lbs;
    int lead_coat_copper_3x8_lbs;

    
public Products(){}

// do I need this many args? this should be customizeable based on shipments
    public Products(int copper_roll_3x500ft_lbs, int copper_roll_2x250ft_lbs, int copper_roll_18in_lbs,
        int copper_sheet_2x6_lbs, int copper_sheet_3x8_lbs, int lead_coat_copper_3x8_lbs) {
    
    super();
    this.copper_roll_3x500ft_lbs = copper_roll_3x500ft_lbs;
    this.copper_roll_2x250ft_lbs = copper_roll_2x250ft_lbs;
    this.copper_roll_18in_lbs = copper_roll_18in_lbs;
    this.copper_sheet_2x6_lbs = copper_sheet_2x6_lbs;
    this.copper_sheet_3x8_lbs = copper_sheet_3x8_lbs;
    this.lead_coat_copper_3x8_lbs = lead_coat_copper_3x8_lbs;
}


    public int getCopper_roll_3x500ft_lbs() {
        return copper_roll_3x500ft_lbs;
    }
    public void setCopper_roll_3x500ft_lbs(int copper_roll_3x500ft_lbs) {
        this.copper_roll_3x500ft_lbs = copper_roll_3x500ft_lbs;
    }
    public int getCopper_roll_2x250ft_lbs() {
        return copper_roll_2x250ft_lbs;
    }
    public void setCopper_roll_2x250ft_lbs(int copper_roll_2x250ft_lbs) {
        this.copper_roll_2x250ft_lbs = copper_roll_2x250ft_lbs;
    }
    public int getCopper_roll_18in_lbs() {
        return copper_roll_18in_lbs;
    }
    public void setCopper_roll_18in_lbs(int copper_roll_18in_lbs) {
        this.copper_roll_18in_lbs = copper_roll_18in_lbs;
    }
    public int getCopper_sheet_2x6_lbs() {
        return copper_sheet_2x6_lbs;
    }
    public void setCopper_sheet_2x6_lbs(int copper_sheet_2x6_lbs) {
        this.copper_sheet_2x6_lbs = copper_sheet_2x6_lbs;
    }
    public int getCopper_sheet_3x8_lbs() {
        return copper_sheet_3x8_lbs;
    }
    public void setCopper_sheet_3x8_lbs(int copper_sheet_3x8_lbs) {
        this.copper_sheet_3x8_lbs = copper_sheet_3x8_lbs;
    }
    public int getLead_coat_copper_3x8_lbs() {
        return lead_coat_copper_3x8_lbs;
    }
    public void setLead_coat_copper_3x8_lbs(int lead_coat_copper_3x8_lbs) {
        this.lead_coat_copper_3x8_lbs = lead_coat_copper_3x8_lbs;
    }

    @Override
    public String toString() {
        return "Inventory [copper_roll_3x500ft_lbs=" + copper_roll_3x500ft_lbs + ", copper_roll_2x250ft_lbs="
                + copper_roll_2x250ft_lbs + ", copper_roll_18in_lbs=" + copper_roll_18in_lbs + ", copper_sheet_2x6_lbs="
                + copper_sheet_2x6_lbs + ", copper_sheet_3x8_lbs=" + copper_sheet_3x8_lbs
                + ", lead_coat_copper_3x8_lbs=" + lead_coat_copper_3x8_lbs + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + copper_roll_3x500ft_lbs;
        result = prime * result + copper_roll_2x250ft_lbs;
        result = prime * result + copper_roll_18in_lbs;
        result = prime * result + copper_sheet_2x6_lbs;
        result = prime * result + copper_sheet_3x8_lbs;
        result = prime * result + lead_coat_copper_3x8_lbs;
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
        Products other = (Products) obj;
        if (copper_roll_3x500ft_lbs != other.copper_roll_3x500ft_lbs)
            return false;
        if (copper_roll_2x250ft_lbs != other.copper_roll_2x250ft_lbs)
            return false;
        if (copper_roll_18in_lbs != other.copper_roll_18in_lbs)
            return false;
        if (copper_sheet_2x6_lbs != other.copper_sheet_2x6_lbs)
            return false;
        if (copper_sheet_3x8_lbs != other.copper_sheet_3x8_lbs)
            return false;
        if (lead_coat_copper_3x8_lbs != other.lead_coat_copper_3x8_lbs)
            return false;
        return true;
    }

    




}

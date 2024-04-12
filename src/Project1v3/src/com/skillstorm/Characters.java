package com.skillstorm;

public class Characters extends Control {
    // properties
    private String name;
    private String description;
    private int health; 
    private int courage;
    private int strength;
    private int intelligence;

    // constructors//
    public Characters() {
    }

    public Characters(String name, String description) {
        
        this.name = name;
        this.description = description;
    }

    public Characters(int health, int courage, int strength, int intelligence) {
        this("name", "description");
        this.health = health;
        this.courage = courage;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    // methods for stat increment

    public void increaseHeatlh(int amount) {
         health+= amount;
         if (health > 100) { // cap heatlh at 100
            health = 100; 
        } // implement logic to end game if heatlth drops to zero
    }

    public void increaseCourage(int amount) {
        courage+= amount;
    }

    public void increaseStrength(int amount) {
        strength+= amount;
    }

    public void increaseIntelligence( int amount) {
        intelligence+= amount;
    }
// methods for state decrement
    public void decreaseHeatlh(int amount) {
        health-= amount;
    }

    public void decreaseCourage(int amount) {
        courage-= amount;
    }

    public void decreaseStrength(int amount) {
        strength-= amount;
    }

    public void decreaseIntelligence(int amount) {
        intelligence-= amount;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    

    // to String
    @Override
    public String toString() {
        return "Character: " + name +
                "\nDescription: " + description +
                "\nHealth: " + health +
                "\nCourage: " + courage +
                "\nStrength: " + strength +
                "\nIntelligence: " + intelligence;
    }
   
}

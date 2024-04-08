package com.skillstorm;

public class Characters {
// properties
    private String name;
    private String description;
    private int health; // tried to use short type here but the constructor chain wasn't allowing it
    private int courage;
    private int strength;
    private int intelligence;

    // constructors//
public Characters(){}

public Characters(String name, String description){
     // forced conversion to int so changed property type
    this.name = name;
    this.description = description;
}


public Characters(int health, int courage, int strength, int intelligence){
    this("name" , "description");
    this.health = health;
    this.courage = courage;
    this.strength = strength;
    this.intelligence = intelligence;
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
           "\nIntelligence: " + intelligence;}


 // main  
public static void main(String ... args) {

//create instances
        Characters c1 = new Characters(100,7,10,6);
        c1.setName("Arthur Pendragon");
        c1.setDescription("Arthur Pendragon, is a legendary figure steeped in chivalry and honor.\nHailing from Camelot, he wields the mythical sword Excalibur, symbolizing his strength\nand righteousness.");
        Characters c2 = new Characters(100,10,6,7);
        c2.setName("Joan of Arc");
        c2.setDescription("Joan of Arc, the Maid of Orleans, is a fearless and devout warrior\nknown for her unwavering faith and determination. Joan's remarkable courage and\nconviction inspire those around her.");
        Characters c3 = new Characters(100,7,6,10);
        c3.setName("Robin of Locksley");
        c3.setDescription("Robin of Locksley, also known as Robin Hood, is a legendary outlaw\nwith a heart of gold. He roams Sherwood Forest with his Merry Men, championing\nthe oppressed and standing against tyranny.");
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println(c3);
    }

}

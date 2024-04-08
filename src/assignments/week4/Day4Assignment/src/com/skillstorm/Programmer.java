package com.skillstorm;

import java.util.ArrayList; // import ArrayList utility

public class Programmer {
// encapsulated properties
private String name;
private String company;


// constructors
Programmer(){}

Programmer(String name, String company){
    this.name = name;
    this.company = company;
}
// public ArrayList<String> languages(); // thought I may need to create a constructor but did not work

// getters and setters

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getCompany() {
    return company;
}

public void setCompany(String company) {
    this.company = company;
}

// public ArrayList<String> getLanguages() {
//     return languages;
// }

// public void learn(String languages) { // so dont make this argument a String array
//     languages.add(null);
// }
// public void forget(ArrayList<String> languages){
//     this.languages = languages;


// methods

  


    @Override
public String toString() {
    return "Programmer [name=" + name + ", company=" + company + ", getName()=" + getName() + ", getCompany()="
            + getCompany() + "]";
}

    public static void main(String... args)  {
        Programmer programmer = new Programmer();
        programmer.setName("Michael");
        programmer.setCompany("CGI Federal");
        ArrayList <String> languages = new ArrayList<>(4); // set capacity
        languages.add("Python"); // can use braces to add multiple items similar to arrays {} ?
        languages.add("JSON");
        languages.add("JAVA");
        languages.add("C++");
        System.out.println("Hi I am " + programmer.getName() + ".");
        System.out.println("I am an apprenctice Software Developer with " + programmer.getCompany());
        System.out.println("I currently know, " + languages + " programming languages");
        languages.remove(0);
        System.out.println("Well, it has been awhile so I actually forgot one, the updated list is " + languages);
    }
}


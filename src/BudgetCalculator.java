package com.skillstorm.assignments;

import java.util.Scanner;

public class BudgetCalculator {
public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);

// Greet the user

    System.out.print("Enter your name:");
    String name = Scanner.nextLine();
    System.out.println("Hello " + name + ", Let's go over your monthly expenses and see if we can save you some money.");

    // inform user to enter in expenses by category
    System.out.println("First, lets gather some information");

    // input net monthly income 
    System.out.print("What is your net monthly income? $"); // couldnt figure out '$' input from users
    int income = Scanner.nextInt();
    System.out.println("What is your monthly rent? $"); 
    int rent = Scanner.nextInt();
    System.out.println("How about utilities? $");
    int utilities = Scanner.nextInt();
    System.out.println("What is your monthly groceries bill? $");
    int groceries = Scanner.nextInt(); 
    Scanner.nextLine();
    System.out.println("Next, what is your car payment? $");
    int car = Scanner.nextInt();
    Scanner.nextLine();
    System.out.println("Any expenses budgeted for entertainment? $");
    int entertainment = Scanner.nextInt();
    int totalExpenses = rent + utilities + groceries + car + entertainment;
    System.out.println("Looks like your total monthly expenses are $" + totalExpenses);
    System.out.println();
    double savings = (income - totalExpenses) * 0.25; 
    System.out.println("It is often recommened to save 25% of your net incomer each month.");
    System.out.println();
    System.out.println("Therefore, you should attempt to save $" + savings + " each month.\n I hope this was helpful, and good luck! With a little disclipine you can do it!");

    /* using the multiline string function would be better here however I was having diffficulties with it */
    
    Scanner.close();
}
}


package com.skillstorm.assignments;

// import Scanner util //
import java.util.Scanner;
//import random utility//
import java.util.Random;

public class DiceRoll {

//declare main//
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// prompt user to guess the number from a single die roll//
    System.out.println("Hello, let's roll a die. are you feeling lucky?");

    // initalize random number before user guess to allow for testing
    Random randomGenerator = new Random();
    int roll = randomGenerator.nextInt(5) + 1 ;
    // prompt user to input their guess
    System.out.print("Please enter a number between 1 and 6: ");
    int guess = input.nextInt(); 

    // prompt user to enter a wager amount
    System.out.println("Let's make a wager. How much would like to bet, I'll give you 3:1 odds");
    System.out.print("Enter dollar amount $ ");
    double wager = input.nextDouble();

    System.out.println("Rolllin...");
    // // additional ... for suspense//
    System.out.println("...");
    System.out.println("And the number was " + roll);

    // calculate payout if correct guess
    double winnings = wager * 3;
    // insert if else statement
    if (guess == roll) {
        System.out.println("Congratulations you won!");
        System.out.printf("You won $%.2f%n ", + (winnings + wager));
        
    } else {
        System.out.println("Sorry, that was in correct. Thanks for playing!");
        
    }

     input.close();


    
}

}

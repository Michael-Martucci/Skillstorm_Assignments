package com.skillstorm;
import java.util.Scanner;
public class Houston {

    private String currentScene;
    


    Houston(){}; // no args
    Houston(String currentScene){
        this.currentScene = currentScene;
    }
    public static void main (String ... args){
        Scanner in = new Scanner(System.in); // initalize scanner

        // need to add character selection and descriptions first

        Scenario greeting = new Scenario();
        greeting.setGreeting("Greetings my liege. The throne of mankind lies dormant. However, in order to claim it, one must\nembark on a perilous journey that will test strength, courage, and wit in order to determine\nworthiness. It known as the Realm of Obscura and it is filled with dark magic and danerous creatues. Many a valiant spirit has faltered and succumbed\nto the abyss of failure. Should thou emerge triumphant, thou will be regarded as the rightful\nheir to the throne, the sovereign ruler of mankind. Embark at thou own peril!");
        Scenario ob = new Scenario();
        ob.setObscura("Two wings sphinxes with interlocked spears guard the enterance to Obscura. As you approach thir spears unlock and a cavern appears with stairs which seem to descend for miles.");
        Scenario s1 = new Scenario();
        s1.setScenario1("You descend into a small dark room. Upon stepping off the stairs a wall closes the exit behind you.\nYou notice a boulder blocking the only exit and see an old thome on a pedastool. You grab a torch\noff the wall to help guide you. Suddenly the walls shake and the room starts rapidly filling with\nwater!\nWhat do you do?");
        
        System.out.println(greeting.getGreeting());
        System.out.println("Do you wish to proceed? yes / no");
        String startGame = in.nextLine().toLowerCase();
            if (startGame.contains("n")){ // do i need ignore case?
            System.out.println("See you next time!");
        }
            else if (startGame.contains("y")){
            System.out.println(ob.getObscura());
        }
            else{ System.out.println("Please select yes / no"); 
        }
        System.out.println();
        System.out.println(s1.getScenario1()); // first scene user choices
        System.out.println();
        System.out.println("A: Push the bolder out of the way");
        System.out.println("B: Open the Thome");
        System.out.println("C: Float");

        String choice1 = in.nextLine().toLowerCase();

        switch (choice1) {
            case "a":
                System.out.println("The boulder doesnt move!");
                break;
            case "b":
                System.out.println("As you open the book an otherworldy voice begins to chant a mystic spell. The boulder breaks apart, revealing the doorway and allowing the water to flow out and down a drain and you proceed to safety");
                System.out.println(" + 1 intellegence");
                break;
            case "c":
                System.out.println("You float as the water continues to rise. It fills the room and you drown. Game Over");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        in.close();
    }
}

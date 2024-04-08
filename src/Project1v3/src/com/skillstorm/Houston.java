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
      
        Scenario greeting = new Scenario();
        greeting.setGreeting("Greetings my liege. The throne of mankind lies dormant. However, in order to claim it, one must\nembark on a perilous journey that will test strength, courage, and wit in order to determine\nworthiness. It known as the Realm of Obscura and it is filled with dark magic and danerous creatues. Many a valiant spirit has faltered and succumbed\nto the abyss of failure. Should thou emerge triumphant, thou will be regarded as the rightful\nheir to the throne, the sovereign ruler of mankind. Embark at thou own peril!");
        Characters c1 = new Characters(100,7,10,6);
        c1.setName("Arthur Pendragon");
        c1.setDescription("Arthur Pendragon, is a legendary figure steeped in chivalry and honor.\nHailing from Camelot, he wields the mythical sword Excalibur, symbolizing his strength\nand righteousness.");
        Characters c2 = new Characters(100,10,6,7);
        c2.setName("Joan of Arc");
        c2.setDescription("Joan of Arc, the Maid of Orleans, is a fearless and devout warrior\nknown for her unwavering faith and determination. Joan's remarkable courage and\nconviction inspire those around her.");
        Characters c3 = new Characters(100,7,6,10);
        c3.setName("Robin of Locksley");
        c3.setDescription("Robin of Locksley, also known as Robin Hood, is a legendary outlaw\nwith a heart of gold. He roams Sherwood Forest with his Merry Men, championing\nthe oppressed and standing against tyranny.");
        Scenario ob = new Scenario();
        ob.setObscura("Two wings sphinxes with interlocked spears guard the enterance to Obscura. As you approach thir spears unlock and a cavern appears with stairs which seem to descend for miles.");
        Scenario s1 = new Scenario();
        s1.setScenario1("You descend into a small dark room. Upon stepping off the stairs a wall closes the exit behind you.\nYou notice a boulder blocking the only exit and see an old thome on a pedastool. You grab a torch\noff the wall to help guide you. Suddenly the walls shake and the room starts rapidly filling with\nwater!\nWhat do you do?");
        Scenario s2 = new Scenario();
        s2.setScenario2("After escaping the flooded room you wind through a cavern of twists and turns. You've been walking\nfor hours and fatigue is setting in. Finally you see a dim light up ahead and enter into another\nchamber.There are two chalices set on an alter along with a scroll and you see a man chained to the\nwall.You open the scroll which says 'One sip shows the way, one seals your fate.'\nWhat do you do?");
        Scenario s3 = new Scenario();
        s3.setScenario3("The next encounter in the labryinth comes as the cavern suddenly opens up to a field. You see a cave\nup ahead and continue towards it. As you approach your heels crunch on the ground and you realize\nyou are walking through a bone yard. Arriving at the cave entrance you pause to look around.You see\nnothing except a small white rabbit bouncing around the mouth of the cave.\nWhat do you do?");
        Scenario s4 = new Scenario();
        s4.setScenario4("Exhausted and out of breath you arrive at a riverbank and sit down to rest and drink. You hear an\neerie voice signing a tune in a strange language, and a boat appears out of the fog. A small hooded\nfigure with sharp teeth and rounded furry ears floats along on an old row boat. You flag him down\nand ask which direction to take. The creature replies 'I will show you the path you seek, but first\nyou must answer my riddle. Answer incorrectly and I will kill and eat you.'\nSolve the riddle to continue:\n'I speak without a mouth and hear without ears. I have no body, but I come alive with the wind.\nWhat am I?");
        Scenario s5 = new Scenario();
        s5.setScenario5("The creature escorts you to the base of a tall tower miles away. You ascend the stairs to the top\nwhere you encounter a white wizard. 'I am the White Wizard of Onza. You have made it to the end of\nyour journey and have proven yourself capable of leading the human realm. Before you may take the\nthrown you must know. I have gazed into the future and if you accept the crown the human world will\nbe plagued with strife and horrors for centuries. Knowing what you now know do you wish to accept\nthe throne or leave it vacant which would confine you to this labryrith for all eternity.'\nWhich do you choose?' ");
        Scenario endScene = new Scenario();
        endScene.setEndScene("Congratulations my leige! You have survived the realm and have proven yourself worthy to rule.\nLong live the king!");
        // need print final stats and disply high scores
        // need to ask if want to play again
        
        
        
        
        
        
        
        
        
        
        
        System.out.println(greeting.getGreeting());
        System.out.println("Do you wish to proceed? yes / no");
        String startGame = in.nextLine().toLowerCase();
            if (startGame.contains("n")){ // do i need ignore case?
            System.out.println("See you next time!");
        }
            else if (startGame.contains("y")){
                System.out.println("Please select your character: (Select i for more details)");
                System.out.println("A: " + c1.getName());
                System.out.println("B: " + c2.getName());
                System.out.println("C: " + c3.getName());
                
        }
            else{ System.out.println("Please select yes / no"); 
        }
        String charSelect = in.nextLine().toLowerCase();
        if (charSelect.contains("a")|| charSelect.contains("b")|| charSelect.contains("c")){
            System.out.println(ob.getObscura());
        }
        //     else if (charSelect.contains("i")){
        //         System.out.println("Stats:)");
        //         System.out.println("A: " + c1.getName());
        //         System.out.println();    
        //         System.out.println("B: " + c2.getName());
        //         System.out.println();
        //         System.out.println("C: " + c3.getName());
                
        // }
            else{ System.out.println("Please select a character");
    }
    // need to get this to return to character selection scanner input if I or invalid

    System.out.println(s1.getScenario1());
    System.out.println(); 
    Selection sc1 = new Selection();
    sc1.setSceneChoices("A: Push the boulder \n"
        +"B: Open the Thome \n"
        +"C: Float \n");
    System.out.println(sc1.getSceneChoices()); /// choices for scenario1
    String choice1 = in.nextLine().toLowerCase();

    switch (choice1) {
        case "a":
            System.out.println("The boulder doesn't move!");
            break;
        case "b":
        //    if{ // if (s1.getCharisma() >= 8) {
                System.out.println("As you open the book, an otherworldly voice begins to chant a mystic spell.");
                System.out.println("The boulder breaks apart, revealing the doorway and allowing the water to flow out.");
                System.out.println("You proceed to safety.");
                System.out.println("+1 intelligence"); // insert stat increment
        //     } else {
        //         System.out.println("You try to open the book, but nothing happens.");
        //         System.out.println("The water continues to rise, and you start to panic.");
        //         System.out.println("Game Over");
        //     }
        //     break;
        case "c":
            System.out.println("You float as the water continues to rise. It fills the room, and you drown");
            System.out.println("Game Over"); // insert would you like to play again option
            break;
        default:
            System.out.println("Invalid Entry");
            break;
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println(s2.getScenario2());
        System.out.println(); 
        Selection sc2 = new Selection();
    sc2.setSceneChoices("A: Drink from chalice #1 \n"
        +"B: Drink from Chalice #2 \n"
        +"C: Give the chained man a drink \n");
     String choice2 = in.nextLine().toLowerCase();

    switch (choice2) {
        case "a":
            System.out.println("Your throat tightens and the room fades to black");
            System.out.println("Your fate is sealed. Game over"); // insert restart game
            break;
        case "b":
        //    if{ // if (s1.getCharisma() >= 8) {
                System.out.println("Your thirst has been quenched!");
                System.out.println("A door way is revealed in the stone wall providing you an exit.");
                System.out.println("You may proceed");
                System.out.println("+1 courage"); // insert stat increment
        //     } else {
        //         System.out.println("You try to open the book, but nothing happens.");
        //         System.out.println("The water continues to rise, and you start to panic.");
        //         System.out.println("Game Over");
        //     }
        //     break;
        case "c":
            System.out.println("You give the man a sip and wait a moment. The man groans in pain and collapses. You drink from the other chalice");
            System.out.println("A door way is revealed in the stone wall providing you an exit"); // insert would you like to play again option
            System.out.println("+1 intelligence"); // stat icrement
            break;
        default:
            System.out.println("Invalid Entry");
            break;
    }   

    System.out.println(s3.getScenario3());
    System.out.println(); 
    Selection sc3 = new Selection();
    sc3.setSceneChoices("A: Charge  \n"
        +"B: Run away \n"
        + "C: Taunt");
        String choice3 = in.nextLine().toLowerCase();

    switch (choice3) {
        case "a":
            System.out.println("That's the most foul, cruel, and bad-tempered rodent you ever set eyes on"); 
            System.out.println("The rabbit lunges at your neck and gnawls your head off. Game over");// insert restart game
            break;
        case "b":
        //    if{ // if (s1.getCharisma() >= 8) {
                System.out.println("You ran away");
                System.out.println("That was rabbit was the guardian of Caerbannog.");
                System.out.println("It's got a vicious streak a mile wide! It's a killer!");
                System.out.println("+1 Intelligence"); // insert stat increment
        //     } else {
        //         System.out.println("You try to open the book, but nothing happens.");
        //         System.out.println("The water continues to rise, and you start to panic.");
        //         System.out.println("Game Over");
        //     }
        //     break;
        case "c":
            System.out.println("Hey rabbit, Your mother was a hamster and your father smelt of elderberries!");
            System.out.println("The rabbit lunges at your neck and gnawls your head off."); // insert would you like to play again option
            System.out.println("Game Over"); // insert restart
            break;
        default:
            System.out.println("Invalid Entry");
            break;
    }   
    

    System.out.println(s4.getScenario4());
    System.out.println(); 
    Selection sc4 = new Selection();
    sc4.setSceneChoices("A: A whisper \n"
        +"B: Music \n"
        +"C: An echo \n"
        +"D: Silence");
        String choice4 = in.nextLine().toLowerCase();

        switch (choice4) {
            case "a":
                System.out.println("Before you can react the creature pulls out a blow gun and fires a dart into your arm. Everything fades to black"); 
                System.out.println("You awake to find yourself inside a hut with a large culdroun boiling and the creature singing it's tune and sharpening a knife");// insert restart game
                System.out.println("Game Over"); // insert restart
                break;
            case "b":
            //    if{ // if (s1.getCharisma() >= 8) {
                System.out.println("Before you can react the creature pulls out a blow gun and fires a dart into your arm. Everything fades to black"); 
                System.out.println("You awake to find yourself inside a hut with a large culdroun boiling and the creature singing it's tune and sharpening a knife");// insert restart game
                System.out.println("Game Over"); // insert restart
            //     } else {
            //         System.out.println("You try to open the book, but nothing happens.");
            //         System.out.println("The water continues to rise, and you start to panic.");
            //         System.out.println("Game Over");
            //     }
            //     break;
            case "c":
                System.out.println("The tiny creature becomes furious, hurling curses at you in its foregin tounge");
                System.out.println("Fine! I will show you you way."); 
                System.out.println("+1 intelligence"); // stat increment
                break;
            case "d":
                System.out.println("Before you can react the creature pulls out a blow gun and fires a dart into your arm. Everything fades to black"); 
                System.out.println("You awake to find yourself inside a hut with a large culdroun boiling and the creature singing it's tune and sharpening a knife");// insert restart game
                System.out.println("Game Over"); // insert restart
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }   

    // System.out.println(s5.getScenario5());
    // System.out.println(); 
    Selection sc5 = new Selection();
    sc5.setSceneChoices("A: Push the boulder \n"
        +"B: Open the Thome \n"
        +"C: Float \n");
    // // choices for number 5




        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        in.close();
    }
}

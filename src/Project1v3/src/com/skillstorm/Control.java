/*Control Class handles the game mechanics

Project 1 version3

author: Michael Martucci

submitted 04/12/2024

Sources: Stack Overflow, Oracle docs, Java T point, Youtube,  

 */

package Project1v3.src.com.skillstorm;

import java.util.Scanner; // import scanner

public class Control {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in); // initalize scanner

        // build playable characters
        Characters char1 = new Characters(100, 70, 99, 60);
        char1.setName("Arthur Pendragon");
        char1.setDescription("Arthur Pendragon, is a legendary figure steeped in chivalry and honor. Hailing from\n"
                + "Camelot,he wields the mythical sword Excalibur, symbolizing his strength and righteousness.");

        Characters char2 = new Characters(100, 99, 60, 70);
        char2.setName("Joan of Arc");
        char2.setDescription("Joan of Arc, the Maid of Orleans, is a fearless and devout warrior known for her\n"
                + "unwavering faith and determination. Joan's remarkable courage and conviction inspires those\n"
                + "around her.");
        Characters char3 = new Characters(100, 80, 60, 99);
        char3.setName("Robin of Locksley");
        char3.setDescription("Robin of Locksley, also known as 'Robin Hood', is a legendary outlaw with a heart of\n"
                + "gold. He roams Sherwood Forest with his Merry Men, championing the oppressed and standing against\n"
                + "tyranny.");

        // set scenes
        Scenario greeting = new Scenario();
        greeting.setGreeting();
        Scenario ob = new Scenario();
        ob.setObscura();

        Scenario scene1 = new Scenario();
        scene1.setScenario1();

        Scenario scene2 = new Scenario();
        scene2.setScenario2();

        Scenario scene3 = new Scenario();
        scene3.setScenario3();

        Scenario scene4 = new Scenario();
        scene4.setScenario4();

        Scenario scene5 = new Scenario();
        scene5.setScenario5();

        Scenario endScene = new Scenario();
        endScene.setEndScene();

        // begin game flow
        System.out.println();
        System.out.println("STAKE YOUR CLAIM: ");
        System.out.println();
        System.out.println();
        System.out.println(greeting.getGreeting());
        System.out.println();
        System.out.print("Do you wish to proceed?\n"
                + "yes / no: ");
        boolean validEntry = false; // reset for easch do-while
        do {
            String startGame = in.nextLine().toLowerCase();
            System.out.println();
            System.out.println();

            if (startGame.contains("n")) {
                System.out.println();
                System.out.println("See you next time!");
                System.exit(0); // terminates program
            } else if (startGame.contains("y")) {
                validEntry = true;
                System.out.println();
                System.out.println("Please select your character: (Select i for more details)");
                System.out.println("A: " + char1.getName());
                System.out.println("B: " + char2.getName());
                System.out.println("C: " + char3.getName());
                System.out.println("i: Information");

            } else {
                System.out.println("Please select yes / no");
            }
        } while (!validEntry);
        Characters playersCharacter = null;
        validEntry = false; // reset for easch do-while
        do {
            String charSelect = in.nextLine().toLowerCase();
            switch (charSelect) {
                case "a":
                    playersCharacter = char1;
                    validEntry = true;
                    break;
                case "b":
                    playersCharacter = char2;
                    validEntry = true;
                    break;
                case "c":
                    playersCharacter = char3;
                    validEntry = true;
                    break;
                case "i":
                    System.out.println();
                    System.out.println("Controls: yes(y) / no(n) Select: A, B, C"); // navigation controls
                    System.out.println();
                    System.out.println("A: " + char1.toString());
                    System.out.println();
                    System.out.println("B: " + char2.toString());
                    System.out.println();
                    System.out.println("C: " + char3.toString());
                default:
                    System.out.println();
                    System.out.println("Please select a character: \n"
                            + "A: Arthur Pendragon \n"
                            + "B: Joan of Arc \n"
                            + "C: Robin of Locksley \n"
                            + "i: information");
            }
        } while (!validEntry);

        System.out.println();
        System.out.println();
        System.out.println(scene1.getScenario1());
        System.out.println();
        Selection choice1 = new Selection(); // declare variable for choices
        choice1.setSceneChoices1();
        System.out.println(choice1.getSceneChoices1());
        validEntry = false;
        do {
            String answer1 = in.nextLine().toLowerCase();
            switch (answer1) {
                case "a":
                    System.out.println();
                    System.out.println("The boulder doesn't move!"); // add a limit of tries before game over
                    System.out.println("The water is rising fast!");
                    System.out.println("-2 Strength");
                    System.out.println("-5 Health");
                    playersCharacter.decreaseHeatlh(5);
                    playersCharacter.decreaseStrength(2); // adjusted stats method
                    break;
                case "b":
                    System.out.println();
                    System.out.println("As you open the book, an otherworldly voice begins to chant a mystic spell.");
                    System.out.println(
                            "The boulder breaks apart, revealing the doorway and allowing the water to flow out.");
                    System.out.println("You proceed to safety.");
                    System.out.println("+5 Intelligence");
                    playersCharacter.increaseIntelligence(5);
                    validEntry = true;
                    break;
                case "c":
                    System.out.println();
                    System.out.println("You float as the water continues to rise. It fills the room, and you drown");
                    System.out.println("Game Over"); // need to add option to "play again"
                    System.out.println();
                    System.out.println("Would you like to play again");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Entry - Please select:");
                    System.out.println(choice1.getSceneChoices1());
                    break;
            }
        } while (!validEntry);

        System.out.println();
        System.out.println();
        System.out.println(scene2.getScenario2());
        System.out.println();
        Selection choice2 = new Selection();
        choice2.setSceneChoices2();
        System.out.println(choice2.getSceneChoices2());
        validEntry = false;
        do {
            String answer2 = in.nextLine().toLowerCase();

            switch (answer2) {
                case "a":
                    System.out.println();
                    System.out.println("Your throat tightens and the room fades to black");
                    System.out.println("Your fate is sealed. Game over"); // insert restart game
                    System.out.println();
                    System.out.println("Would you like to play again");
                    System.exit(0);
                    validEntry = true;
                    break;
                case "b":
                    System.out.println();
                    System.out.println("Your thirst has been quenched!");
                    System.out.println("A door way is revealed in the stone wall providing you an exit.");
                    System.out.println("You may proceed");
                    System.out.println("+5 Courage");
                    System.out.println("+5 Strength");
                    playersCharacter.increaseCourage(5);
                    playersCharacter.increaseStrength(5);
                    validEntry = true;
                    break;
                case "c":
                    System.out.println();
                    System.out.println(
                            "You give the man a sip and wait a moment. The man groans in pain and collapses. You drink from the other chalice");
                    System.out.println("A door way is revealed in the stone wall providing you an exit"); // insert would you like to play again?                                                                                                    // would yo                                                                                                        // like to                                                                                  // play again                                                                                      // option
                    System.out.println("+5 Intelligence");
                    System.out.println("-10 Courage");
                    playersCharacter.increaseIntelligence(5);
                    playersCharacter.decreaseCourage(10);

                    validEntry = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Entry - Please select:");
                    System.out.println(choice2.getSceneChoices3());

                    break;
            }
        } while (!validEntry);

        System.out.println();
        System.out.println();
        System.out.println(scene3.getScenario3());
        System.out.println();
        Selection choice3 = new Selection();
        choice3.setSceneChoices3();
        System.out.println(choice3.getSceneChoices3());

        validEntry = false;
        do {
            String answer3 = in.nextLine().toLowerCase();

            switch (answer3) {
                case "a":
                    System.out.println();
                    System.out.println("That's the most foul, cruel, and bad-tempered rodent you ever set eyes on");
                    System.out.println("The rabbit lunges at your neck tears you apart!");
                    System.out.println("-10 intelligence"); // add decrease HP
                    System.out.println("-20 heatlh");
                    playersCharacter.decreaseIntelligence(10);
                    playersCharacter.decreaseHeatlh(20);
                    // System.exit(0);

                    break;
                case "b":
                    System.out.println();
                    System.out.println("You ran away");
                    System.out.println("That was creature was the killer rabbit of Caerbannog.");
                    System.out.println("It's got a vicious streak a mile wide!");
                    System.out.println("+10 Intelligence");
                    playersCharacter.increaseIntelligence(10);
                    validEntry = true;
                    break;
                case "c":
                    System.out.println();
                    System.out.println("Hey rabbit, Your mother was a hamster and your father smelt of elderberries!");
                    System.out.println("The rabbit lunges at your neck and tears you apart!");
                    System.out.println("+10 courage");
                    System.out.println("-20 health");
                    playersCharacter.increaseCourage(10);
                    playersCharacter.decreaseHeatlh(20);
                    // System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Entry - Please select:");
                    System.out.println(choice3.getSceneChoices4());
                    break;
            }
        } while (!validEntry);

        System.out.println();
        System.out.println();
        System.out.println(scene4.getScenario4());
        System.out.println("+5 heatlh");
        playersCharacter.increaseHeatlh(5);
        System.out.println();
        Selection choice4 = new Selection();
        choice4.setSceneChoices4();
        System.out.println(choice4.getSceneChoices4());

        validEntry = false;
        do {
            String answer4 = in.nextLine().toLowerCase();

            switch (answer4) {
                case "a":
                    System.out.println();
                    System.out.println(
                            "Before you can react the creature pulls out a blow gun and fires a dart into your arm. Everything fades to black");
                    System.out.println(
                            "You awake to find yourself inside a hut with a large culdroun boiling and the creature singing it's tune and sharpening a knife");                                                                                                                                                 // restart                                                                                                                                          // game
                    System.out.println("Game Over"); // insert restart
                    System.out.println();
                    System.out.println("Would you like to play again");
                    System.exit(0);
                    break;
                case "b":
                    System.out.println();
                    System.out.println(
                            "Before you can react the creature pulls out a blow gun and fires a dart into your arm. Everything fades to black");
                    System.out.println(
                            "You awake to find yourself inside a hut with a large culdroun boiling and the creature singing it's tune and sharpening a knife");                                                                                                                                                           // restart                                                                                                                                                         // game
                    System.out.println("Game Over"); // insert restart
                    System.out.println();
                    System.out.println("Would you like to play again");
                    System.exit(0);
                    break;
                case "c":
                    System.out.println();
                    System.out.println("The tiny creature becomes furious, hurling curses at you in its foregin tounge");
                    System.out.println("Fine! I will show you you way.");
                    System.out.println("+10 intelligence");
                    playersCharacter.increaseIntelligence(10);
                    validEntry = true;
                    break;
                case "d":
                    System.out.println();
                    System.out.println(
                            "Before you can react the creature pulls out a blow gun and fires a dart into your arm. Everything fades to black");
                    System.out.println(
                            "You awake to find yourself inside a hut with a large culdroun boiling and the creature singing it's tune and sharpening a knife");                                                                                                                                                 // restart                                                                                                                                                // game
                    System.out.println("Game Over"); // insert restart
                    System.out.println();
                    System.out.println("Would you like to play again");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Entry - Please select:");
                    System.out.println(choice4.getSceneChoices4());
                    break;
            }
        } while (!validEntry);
        System.out.println();
        System.out.println();
        System.out.println(scene5.getScenario5());
        System.out.println();
        Selection choice5 = new Selection();
        choice5.setSceneChoices5();
        System.out.println(choice5.getSceneChoices5());

        validEntry = false;
        do {
            String answer5 = in.nextLine().toLowerCase();

            switch (answer5) {

                case "a":
                    System.out.println();
                    System.out.println(
                            "Onza: You have made a selfish choice, this was your final test of honor and you failed. "
                                    + " The wizard casts a spell and you fall unconcious. You awake in a dim room chained to "
                                    + " the wall. The only thing in the room is a pedastool which contains 2 chalices! Game Over"); // restart
                    playersCharacter.decreaseCourage(50);
                    System.out.println();
                    System.out.println("Would you like to play again");
                    System.exit(0);
                    break;
                case "b":
                    System.out.println();
                    System.out.println(
                            "Onza: You have passed your final test and have proven yourself honorable. You may dawn the crown");
                    System.out.println(endScene.getEndScene());
                    playersCharacter.increaseCourage(50);
                    validEntry = true;
                    break;
                case "c":
                    System.out.println();
                    System.out.println(
                            "You charge Onza who + casts a spell and you fall unconcious. You awake in a dim room chained to "
                                    + " the wall. The only thing in the room is a pedastool which contains 2 chalices! Game Over"); // restart
                    playersCharacter.increaseCourage(20);
                    playersCharacter.decreaseIntelligence(20);
                    System.out.println();
                    System.out.println("Would you like to play again");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Entry - Please select:");
                    System.out.println(choice5.getSceneChoices5());
                    break;
            }
        } while (!validEntry);
        System.out.println();
        System.out.println(playersCharacter); // should print a different description

        in.close();
    }
}

package com.skillstorm;

public class Scenario {
    private String greeting = null;
    private String obscura = null;
    private String scenario1 = null;
    private String scenario2 = null;
    private String scenario3 = null;
    private String scenario4 = null; 
    private String scenario5 = null;
    private String endScene = null;
      
    

    // constructor
    public Scenario(){}
    public Scenario(String scenario){
        
    }

      // getters and setters
    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
        
    }

    public String getObscura() {
        return obscura;
    }
    public void setObscura(String obscura) {
        this.obscura = obscura;
    }
    public String getScenario1() {
        return scenario1;
    }
    public void setScenario1(String scenario1) {
        this.scenario1 = scenario1;
    }
    public String getScenario2() {
        return scenario2;
    }
    public void setScenario2(String scenario2) {
        this.scenario2 = scenario2;
    }
    public String getScenario3() {
        return scenario3;
    }
    public void setScenario3(String scenario3) {
        this.scenario3 = scenario3;
    }
    public String getScenario4() {
        return scenario4;
    }
    public void setScenario4(String scenario4) {
        this.scenario4 = scenario4;
    }
    

    public String getScenario5() {
        return scenario5;
    }
    public void setScenario5(String scenario5) {
        this.scenario5 = scenario5;
    }
    public String getEndScene() {
        return endScene;
    }
    public void setEndScene(String endScene) {
        this.endScene = endScene;
    }

public static void main (String ... arg){ 

Scenario greeting = new Scenario();// in gui this should be an image of a friar or mage
greeting.setGreeting("Greetings my liege. The throne of mankind lies dormant. However, in order to claim it, one must\nembark on a perilous journey that will test strength, courage, and wit in order to determine\nworthiness. It known as the Realm of Obscura and it is filled with dark magic and danerous creatues. Many a valiant spirit has faltered and succumbed\nto the abyss of failure. Should thou emerge triumphant, thou will be regarded as the rightful\nheir to the throne, the sovereign ruler of mankind. Embark at thou own peril!");
System.out.println(greeting.getGreeting());
System.out.println();

Scenario ob = new Scenario();
ob.setObscura("Two wings sphinxes with interlocked spears guard the enterance to Obscura. As you approach thir spears unlock and a cavern appears with stairs which seem to descend for miles.");
System.out.println(ob.getObscura());
System.out.println();

Scenario s1 = new Scenario();
s1.setScenario1("You descend into a small dark room. Upon stepping off the stairs a wall closes the exit behind you.\nYou notice a boulder blocking the only exit and see an old thome on a pedastool. You grab a torch\noff the wall to help guide you. Suddenly the walls shake and the room starts rapidly filling with\nwater!\nWhat do you do?");
System.out.println(s1.getScenario1());
System.out.println();


Scenario s2 = new Scenario();
s2.setScenario2("After escaping the flooded room you wind through a cavern of twists and turns. You've been walking\nfor hours and fatigue is setting in. Finally you see a dim light up ahead and enter into another\nchamber.There are two chalices set on an alter along with a scroll and you see a man chained to the\nwall.You open the scroll which says 'One sip shows the way, one seals your fate.'\nWhat do you do?");
System.out.println(s2.getScenario2());
System.out.println();


Scenario s3 = new Scenario();
s3.setScenario3("The next encounter in the labryinth comes as the cavern suddenly opens up to a field. You see a cave\nup ahead and continue towards it. As you approach your heels crunch on the ground and you realize\nyou are walking through a bone yard. Arriving at the cave entrance you pause to look around.You see\nnothing except a small white rabbit bouncing around the mouth of the cave.\nWhat do you do?");
System.out.println(s3.getScenario3());
System.out.println();


Scenario s4 = new Scenario();
s4.setScenario4("Exhausted and out of breath you arrive at a riverbank and sit down to rest and drink. You hear an\neerie voice signing a tune in a strange language, and a boat appears out of the fog. A small hooded\nfigure with sharp teeth and rounded furry ears floats along on an old row boat. You flag him down\nand ask which direction to take. The creature replies 'I will show you the path you seek, but first\nyou must answer my riddle. Answer incorrectly and I will kill and eat you.'\nSolve the riddle to continue:\n'I speak without a mouth and hear without ears. I have no body, but I come alive with the wind.\nWhat am I?");
System.out.println(s4.getScenario4());
System.out.println();


Scenario s5 = new Scenario();
s5.setScenario5("The creature escorts you to the base of a tall tower miles away. You ascend the stairs to the top\nwhere you encounter a white wizard. 'I am the White Wizard of Onza. You have made it to the end of\nyour journey and have proven yourself capable of leading the human realm. Before you may take the\nthrown, you must know. I have gazed into the future and if you accept the crown the human world will\nbe plagued with strife and horrors for centuries. Knowing what you now know do you wish to accept\nthe throne or leave it vacant which would confine you to this labryrith for all eternity.'\nWhich do you choose?' ");
System.out.println(s5.getScenario5());
System.out.println();



Scenario endScene = new Scenario();
endScene.setEndScene("Congratulations my leige! You have survived the realm and have proven yourself worthy to rule.\nLong live the king!");

System.out.println(endScene.getEndScene());
System.out.println();

}
}



package Project1v3.src.com.skillstorm;

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
    public Scenario() {
    }

    public Scenario(String scenario) {

    }

    // getters and setters
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting() {
        this.greeting = "Greetings my liege. The throne of mankind lies dormant. "
                + "However, in order to claim it, one must\nembark on a perilous journey that will "
                + "test strength, courage, and wit in order to determine\nworthiness. It known as "
                + "the 'Realm of Obscura' and it is filled with dark magic and dangerous\ncreatures."
                + "Many a valiant spirit has faltered and succumbed to the abyss of failure. Should "
                + "thou\nemerge triumphant,thou will be regarded as the rightful heir to the throne, "
                + "and the sovereign ruler of mankind.\nEmbark at thou own peril!";
        ;

    }

    public String getObscura() {
        return obscura;
    }

    public void setObscura() {
        this.obscura = "Two wings sphinxes with interlocked spears guard the enterance to Obscura. As you "
                + "approach their\nspears unlock and a cavern appears with stairs which seem to descend for miles.";
    }

    public String getScenario1() {
        return scenario1;
    }

    public void setScenario1() {
        this.scenario1 = "You descend into a small dark room. Upon stepping off the stairs a wall closes "
                + "the exit behind you.\nYou notice a boulder blocking the only exit and see an old thome on a "
                + "pedastool. You grab a torch\noff the wall to help guide you. Suddenly the walls shake and the "
                + "room starts rapidly filling\nwith water!\nWhat do you do?";
    }

    public String getScenario2() {
        return scenario2;
    }

    public void setScenario2() {
        this.scenario2 = "After escaping the flooded room you wind through a cavern of twists and turns. "
                + "You've been walking\nfor hours and fatigue is setting in. Finally you see a dim light up ahead "
                + "and enter into another\nchamber.There are two chalices set on an alter along with a scroll and "
                + "you notice a man chained to\nthe wall.You open the scroll which says 'One sip shows the way, "
                + "one seals your fate.'\nWhat do you do?";
    }

    public String getScenario3() {
        return scenario3;
    }

    public void setScenario3() {
        this.scenario3 = "The next encounter in the labryinth comes as the cavern suddenly opens up to a "
                + "field. You see a\ncave up ahead and continue towards it. As you approach your heels crunch on "
                + "the ground and you\nrealize you are walking through a bone yard! Arriving at the cave entrance "
                + "you pause to look\naround. Suddenly you notice a small white rabbit bouncing around the mouth of "
                + "the cave.\nWhat do you do?";
    }

    public String getScenario4() {
        return scenario4;
    }

    public void setScenario4() {
        this.scenario4 = "Exhausted and out of breath you arrive at a riverbank and sit down to rest and "
                + "drink. You hear an\neerie voice signing a tune in a strange language, and a boat appears out of "
                + "the fog. A small hooded\nfigure with sharp teeth and rounded furry ears floats along on an old "
                + "row boat. You flag him down\nand ask which direction to take. The creature replies 'I will show "
                + "you the path you seek, but first\nyou must answer my riddle. Answer incorrectly and I will kill "
                + "and eat you.'\nSolve the riddle to continue:\n'I speak without a mouth and hear without ears. "
                + "I have no body, but I come alive with the wind.\nWhat am I?";
    }

    public String getScenario5() {
        return scenario5;
    }

    public void setScenario5() {
        this.scenario5 = "The creature escorts you to the base of a tall tower miles away. You ascend the "
                + "stairs to the top\nwhere you encounter a white wizard. 'I am the White Wizard of Onza. You have "
                + "made it to the end of\nyour journey and have proven yourself capable of leading the human realm. "
                + "Before you may take the\nthrown, you must know. I have gazed into the future and if you accept "
                + "the crown the human world will\nbe plagued with strife and horrors for centuries. Knowing what you "
                + "now know, do you wish to accept\nthe throne or leave it vacant which would confine you to this "
                + "labryrith for all eternity.'\nWhich do you choose?' ";
    }

    public String getEndScene() {
        return endScene;
    }

    public void setEndScene() {
        this.endScene = "Congratulations my leige! You have survived the realm and have proven yourself worthy to rule.\n"
                + "Long live the King/Queen!";
    }

}

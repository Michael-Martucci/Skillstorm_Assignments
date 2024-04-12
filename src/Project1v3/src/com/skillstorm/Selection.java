package com.skillstorm;

public class Selection {
    private String startGame;
    private String sceneChoices1 = null;
    private String sceneChoices2 = null;
    private String sceneChoices3 = null;
    private String sceneChoices4 = null;
    private String sceneChoices5 = null;
    private String showStats; // not implemented yet
    private String highScores; // not implemented yet
    private String playAgain; // not implemented yet

    // constructors
    Selection() {
    } // no args

    // getters and setters
    public String getStartGame() {
        return startGame;
    }

    public void setStartGame(String startGame) {
        this.startGame = startGame;
    }

    public String getSceneChoices1() {
        return sceneChoices1;
    }

    public void setSceneChoices1() {
        this.sceneChoices1 = "A: Push the boulder\n"
        + "B: Open the Thome\n"
        + "C: Float";
    }

    public String getSceneChoices2() {
        return sceneChoices2;
    }

    public void setSceneChoices2() {
        this.sceneChoices2 = "A: Drink from chalice #1\n"
        + "B: Drink from Chalice #2\n"
        + "C: Give the chained man a drink";
    }

    public String getSceneChoices3() {
        return sceneChoices3;
    }

    public void setSceneChoices3() {
        this.sceneChoices3 = "A: Charge\n"
        + "B: Run away\n"
        + "C: Taunt";
    }

    public String getSceneChoices4() {
        return sceneChoices4;
    }

    public void setSceneChoices4() {
        this.sceneChoices4 = "A: Music\n"
        + "B: A Wisper\n"
        + "C: An echo\n"
        + "D: Silence";
    }

    public String getSceneChoices5() {
        return sceneChoices5;
    }

    public void setSceneChoices5() {
        this.sceneChoices5 = "A: Accept the crown\n"
        + "B: Deny the crown\n"
        + "C: Fight the wizard";
    }

    public String getShowStats() {
        return showStats;
    }

    public void setShowStats(String showStats) {
        this.showStats = showStats;
    }

    public String getHighScores() {
        return highScores;
    }

    public void setHighScores(String highScores) {
        this.highScores = highScores;
    }

    public String getPlayAgain() {
        return playAgain;
    }

    public void setPlayAgain(String playAgain) {
        this.playAgain = playAgain;
    }

    // main
    public static void main(String... args) {

    }

}

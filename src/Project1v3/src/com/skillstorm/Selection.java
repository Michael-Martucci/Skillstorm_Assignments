package com.skillstorm;

public class Selection {
private String startGame;
private String sceneChoices = null;
private String showStats;
private String highScores;
private String playAgain;

//constructors
Selection(){} // no args

Selection(String sceneChoices){
    this.sceneChoices = sceneChoices;
}

// getters and setters
public String getStartGame() {
    return startGame;
}

public void setStartGame(String startGame) {
    this.startGame = startGame;
}

public String getSceneChoices() {
    return sceneChoices;
}

public void setSceneChoices(String sceneChoices) {
    this.sceneChoices = sceneChoices;
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
public static void main (String ... args){
 Selection sc1 = new Selection();
 sc1.setSceneChoices("");
 
}






}

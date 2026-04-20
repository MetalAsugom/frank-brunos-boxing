package edu.teamrocket;

public class ScoreCard {

    private final String color;
    private String redCorner;
    private String blueCorner;
    private final String judgeScoreCard;




    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public void setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public loadJudgeScoreCard() {}
}
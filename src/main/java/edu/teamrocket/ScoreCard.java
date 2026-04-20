package edu.teamrocket;

import java.util.ArrayList;
import java.util.List;
import edu.teamrocket.Round;

public class ScoreCard {

    private final String color;
    private String redCorner;
    private String blueCorner;
    private String judgeScoreCard;
    private List<Round> rounds = new ArrayList<Round>();

    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public void setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public int getRedBoxerFinalScore() {
        int score = 0;
        for (Round round : rounds) {
            score += round.getRedBoxerScore();
        }
        return score;
    }

    public int getBlueBoxerFinalScore() {
        int score = 0;
        for (Round round : rounds) {
            score += round.getBlueBoxerScore();
        }
        return score;
    }

    public String loadJudgeScoreCard(String judgeScoreCard) {
        return judgeScoreCard;
    }

    /* calcular scores totales de cada boxeador */
}
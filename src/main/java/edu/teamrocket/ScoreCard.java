package edu.teamrocket;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;
import edu.teamrocket.Round;

public class ScoreCard {

    private final String color;
    private String redCorner;
    private String blueCorner;
    private String[] judgeScoreCard;
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

    public List<Round> getRounds() {
        return rounds;
    }

    public byte getNumRounds() {
        return (byte)rounds.size();
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        
        if (!Arrays.stream(judgeScoreCard).anyMatch(Objects::isNull)){
            this.judgeScoreCard = judgeScoreCard;

            for (String round : judgeScoreCard) {
                rounds.add(RoundFactory.getRound(round));
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder Score = new StringBuilder();
        byte roundCounter = 1;

        Score.append("Round\tScore\tRound\tScore\tRound\n");
        Score.append("Score\tTotal\t     \tTotal\tScore\n");

        for (Round round : rounds) {
            Score.append(round.getBlueBoxerScore() + "\t" + "\t" + roundCounter + "\t" + "\t" + round.getRedBoxerScore() + "\n");
            roundCounter++;
        }
        return Score.toString();
    }
}
package edu.teamrocket;

public class RegularRound implements Round {

    private String round;
    private byte blueBoxerScore;
    private byte redBoxerScore;

    public RegularRound(String round) {
        this.round = round;
        boxerRoundScore();
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public void boxerRoundScore() {
        this.parseScores();
    }

    private void parseScores() {
        this.blueBoxerScore = Byte.parseByte(round.split(" - ")[1]);
        this.redBoxerScore = Byte.parseByte(round.split(" - ")[0]);
    }

    public String getRoundScore() {
        return this.toString();
    }

    @Override
    public String toString() {
        return this.redBoxerScore + "-" + this.blueBoxerScore;
    }
}
package edu.teamrocket;

public class RegularRound implements Round {

    private String round;
    private byte blueBoxerScore;
    private byte redBoxerScore;

    public RegularRound(String round) {
        this.round = round;
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
        this.redBoxerScore = Byte.parseByte(round.split("-")[1]);
        this.blueBoxerScore = Byte.parseByte(round.split("-")[0]);
    }

    public String getRoundScore() {
        return round.split("-")[1] + "-" + round.split("-")[0];
    }

    @Override
    public String toString() {
        return "Round score [" + round + "]";
    }
}
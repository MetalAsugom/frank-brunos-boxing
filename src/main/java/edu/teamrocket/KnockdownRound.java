package edu.teamrocket;

public class KnockdownRound implements Round{

    private String round;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public KnockdownRound (String round) {
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
}
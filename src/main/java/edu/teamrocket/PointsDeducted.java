package edu.teamrocket;

public class PointsDeducted implements Round{
    private String round;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public PointsDeducted(String round) {
        this.round = round.replaceAll(" ", "");
        boxerRoundScore();
    }

    @Override
    public void boxerRoundScore() {
        this.parseScores();
    };

    public byte parseComaBlue (String score) {
        return Byte.parseByte(score.substring(0, score.indexOf(",")));
    }

    public byte parseComaRed (String score) {
        return Byte.parseByte(score.substring(score.indexOf(",") + 1));
    }

    private void parseScores() {

        String[] roundScores = getRoundScore().split("-", 2);
        String redBoxerScore = roundScores[0];
        String blueBoxerScore = roundScores[1];

        if (blueBoxerScore.contains(",")) {
            this.blueBoxerScore = parseComaBlue(blueBoxerScore);
            this.redBoxerScore = Byte.parseByte(redBoxerScore);
        }
        else {
            this.redBoxerScore = parseComaRed(redBoxerScore);
            this.blueBoxerScore = Byte.parseByte(blueBoxerScore);
        }
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    
    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    public String getRoundScore() {
        return this.round;
    }

    @Override
    public String toString() {
        return this.getRedBoxerScore() + "-" + this.getBlueBoxerScore();
    }

}

package edu.teamrocket;

public class PointsDeducted implements Round {
    private String round;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public PointsDeducted(String round) {
        this.round = round.replace(" ", "");
        boxerRoundScore();
    }

    @Override
    public void boxerRoundScore() {
        this.parseScores();
    }

    public byte parseComaBlue(String score) {
        return Byte.parseByte(score.substring(0, score.indexOf(",")));
    }

    public byte parseComaRed(String score) {
        return Byte.parseByte(score.substring(score.indexOf(",") + 1));
    }

    private void parseScores() {

        String[] roundScores = getRoundScore().split("-", 2);
        String redBoxerJudgeScore = roundScores[0];
        String blueBoxerJudgeScore = roundScores[1];

        if (blueBoxerJudgeScore.contains(",")) {
            this.blueBoxerScore = parseComaBlue(blueBoxerJudgeScore);
            this.redBoxerScore = Byte.parseByte(redBoxerJudgeScore);
        } else {
            this.redBoxerScore = parseComaRed(redBoxerJudgeScore);
            this.blueBoxerScore = Byte.parseByte(blueBoxerJudgeScore);
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

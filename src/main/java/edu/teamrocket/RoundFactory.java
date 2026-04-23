package edu.teamrocket;

public class RoundFactory {

    private RoundFactory() {}

    public static Round getRound(String rounds) {
        return switch (rounds) {
            case "10 - 9", "9 - 10" -> new RegularRound(rounds);
            case "10 - 8", "8 - 10" -> new KnockdownRound(rounds);
            case "1, 8 - 10", "10 - 8 ,1" -> new PointsDeducted(rounds);
            default -> null; 
        };
    }
}
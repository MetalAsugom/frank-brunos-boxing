package edu.teamrocket;

public class RoundFactory {

    private RoundFactory() {}

    public static Round getRound(String rounds) {

        switch (rounds) {
            case "10 - 9":
            case "9 - 10":
                return new RegularRound(rounds);
        
            case "10 - 8":
            case "8 - 10":
                return new KnockdownRound(rounds);
            
            case "1, 8 - 10":
            case "1 ,8 - 10":
            case "10 - 8, 1":
            case "10 - 8 ,1":
                return new PointsDeducted(rounds);
            
            default:
                return null;
        }
    }
}
package edu.teamrocket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RegularRoundTest {

    @Test
    void replaceTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(round.getRoundScore(), "10-9");
    }

    @Test
    void roundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(round.getRoundScore(), "10-9");
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }

    @Test // este para el alumnado
    void boxerRoundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }
}

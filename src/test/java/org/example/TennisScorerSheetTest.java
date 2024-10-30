package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TennisScorerSheetTest {

    @Test
    void initialScoreIsLoveAll() {
        TennisScorerSheet scorer = new TennisScorerSheet();
        assertEquals("Love - Love", scorer.getScore());
    }

    @Test
    void playerOneScoresFirstPoint() {
        TennisScorerSheet scorer = new TennisScorerSheet();
        scorer.playerOneScores();
        assertEquals("15 - Love", scorer.getScore());
    }

    @Test
    void playerTwoScoresTwice() {
        TennisScorerSheet scorer = new TennisScorerSheet();
        scorer.playerTwoScores();
        scorer.playerTwoScores();
        assertEquals("Love - 30", scorer.getScore());
    }

    @Test
    void scoreIsTiedAtForty() {
        TennisScorerSheet scorer = new TennisScorerSheet();
        scorer.playerOneScores();
        scorer.playerOneScores();
        scorer.playerOneScores();
        scorer.playerTwoScores();
        scorer.playerTwoScores();
        scorer.playerTwoScores();
        assertEquals("Tie: 40", scorer.getScore());
    }

    @Test
    void playerOneHasAdvantage() {
        TennisScorerSheet scorer = new TennisScorerSheet();
        for (int i = 0; i < 4; i++) scorer.playerOneScores();
        for (int i = 0; i < 3; i++) scorer.playerTwoScores();
        assertEquals("Advantage - 40", scorer.getScore());
    }
}

package org.example;

public class TennisScorerSheet {
    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public String getScore() {
        if (playerOneScore == 0 && playerTwoScore == 0) {
            return "Love - Love";
        } else if (playerOneScore == playerTwoScore) {
            return "Tie: " + convertScore(playerOneScore);
        }
        return convertScore(playerOneScore) + " - " + convertScore(playerTwoScore);
    }

    private String convertScore(int score) {
        switch (score) {
            case 0: return "Love";
            case 1: return "15";
            case 2: return "30";
            case 3: return "40";
            default: return "Advantage";
        }
    }
}

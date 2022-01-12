public class TennisGame1 implements TennisGame {
    private Score1 score = new Score1(0, 0);

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            score.incrementScore1();
        }
        else {
            score.incrementScore2();
        }
    }

    public String getScore() {
        return score.reportScore();
    }
}

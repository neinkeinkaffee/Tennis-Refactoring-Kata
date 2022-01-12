public class TennisGame1 implements TennisGame {
    private Player1 player1 = new Player1();
    private Player1 player2 = new Player1();

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    public String getScore() {
        Score1 score = new Score1(player1.getPoints(), player2.getPoints());
        return score.toString();
    }

}

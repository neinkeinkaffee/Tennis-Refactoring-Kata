public class TennisGame1 implements TennisGame {
    private Player player1 = new Player();
    private Player player2 = new Player();

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    public String getScore() {
        Score score = new Score(player1.getPoints(), player2.getPoints());
        return score.toString();
    }

}

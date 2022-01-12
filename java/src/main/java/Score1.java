public class Score1 {
    private int points1;
    private int points2;

    public Score1(int score1, int score2) {
        this.points1 = score1;
        this.points2 = score2;
    }

    public String toString() {
        if (tie()) return reportScoreForTie();
        if (advantage()) return reportAdvantage();
        if (win()) return reportWin();
        return reportScoreWithoutSpecialName();
    }

    public boolean tie() {
        return points1 == points2;
    }

    public boolean advantage() {
        return (points1 > 3 || points2 > 3) && Math.abs(points1 - points2) == 1;
    }

    public boolean win() {
        return (points1 > 3 || points2 > 3) && Math.abs(points1 - points2) >= 2;
    }

    public String reportAdvantage() {
        if (points1 - points2 > 0) return "Advantage player1";
        return "Advantage player2";
    }

    public String reportWin() {
        if (points1 - points2 > 0) return "Win for player1";
        return "Win for player2";
    }

    public String reportScoreForTie() {
        if (points1 < 3) {
            return toString(points1) + "-All";
        }
        return "Deuce";
    }

    public String reportScoreWithoutSpecialName() {
        return toString(points1) + "-" + toString(points2);
    }

    private static String toString(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        throw new RuntimeException("Unknown score");
    }
}
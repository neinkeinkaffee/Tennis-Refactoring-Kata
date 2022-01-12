public class Score1 {
    private int score1;
    private int score2;

    public Score1(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public String toString() {
        if (tie()) {
            return reportScoreForTie();
        }
        if (advantage()) {
            return reportAdvantage();
        }
        if (win()) {
            return reportWin();
        }
        return reportScoreWithoutSpecialName();
    }

    public boolean tie() {
        return score1 == score2;
    }

    public boolean advantage() {
        return (score1 > 3 || score2 > 3) && Math.abs(score1 - score2) == 1;
    }

    public boolean win() {
        return (score1 > 3 || score2 > 3) && Math.abs(score1 - score2) >= 2;
    }

    public String reportAdvantage() {
        if (score1 - score2 > 0) return "Advantage player1";
        return "Advantage player2";
    }

    public String reportWin() {
        if (score1 - score2 > 0) return "Win for player1";
        return "Win for player2";
    }

    public String reportScoreForTie() {
        if (score1 < 3) {
            return toString(score1) + "-All";
        }
        return "Deuce";
    }

    public String reportScoreWithoutSpecialName() {
        return toString(score1) + "-" + toString(score2);
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
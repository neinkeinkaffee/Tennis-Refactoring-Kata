public class Score {
    private Points points1;
    private Points points2;

    public Score(Points points1, Points points2) {
        this.points1 = points1;
        this.points2 = points2;
    }

    public String toString() {
        if (tie()) return reportScoreForTie();
        if (advantage()) return reportAdvantage();
        if (win()) return reportWin();
        return reportScoreWithoutSpecialName();
    }

    public boolean tie() {
        return points1.equals(points2);
    }

    public boolean advantage() {
        return (points1.isGreaterThan(3) || points2.isGreaterThan(3)) && points1.absoluteDifference(points2) == 1;
    }

    public boolean win() {
        return (points1.isGreaterThan(3) || points2.isGreaterThan(3)) && points1.absoluteDifference(points2) > 1;
    }

    public String reportAdvantage() {
        if (points1.minus(points2).isGreaterThan(0)) return "Advantage player1";
        return "Advantage player2";
    }

    public String reportWin() {
        if (points1.minus(points2).isGreaterThan(0)) return "Win for player1";
        return "Win for player2";
    }

    public String reportScoreForTie() {
        if (points1.isLessThan(3)) {
            return String.format("%s-All", points1);
        }
        return "Deuce";
    }

    public String reportScoreWithoutSpecialName() {
        return String.format("%s-%s", points1, points2);
    }

}
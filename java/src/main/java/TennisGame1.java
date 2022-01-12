
public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        if (weHaveADraw()) {
            return reportScoreForADraw();
        }
        else if (scoreGreaterFour()) {
            return reportScoreGreaterFour();
        }
        return reportDefaultScore();
    }

    private boolean weHaveADraw() {
        return m_score1 == m_score2;
    }

    private boolean scoreGreaterFour() {
        return m_score1 >= 4 || m_score2 >= 4;
    }

    private String reportScoreForADraw() {
        if (m_score1 < 3) {
            return determineScoreName(m_score1) + "-All";
        }
        return "Deuce";
    }

    private String reportScoreGreaterFour() {
        int scoreDifference = m_score1 - m_score2;
        if (scoreDifference == 1) return "Advantage player1";
        if (scoreDifference == -1) return "Advantage player2";
        if (scoreDifference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private String reportDefaultScore() {
        return determineScoreName(m_score1) + "-" + determineScoreName(m_score2);
    }

    private String determineScoreName(int tempScore) {
        switch(tempScore)
        {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        throw new RuntimeException("Invalid score");
    }
}

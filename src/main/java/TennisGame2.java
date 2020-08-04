import java.util.HashMap;
import java.util.Map;

public class TennisGame2 implements TennisGame {
    private int player1Point, player2Point;

    private final String player1Name, player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String getScore() {
        Map<Integer, String> scoreName = new HashMap<Integer, String>() {{
            put(0, "Love");
            put(1, "Fifteen");
            put(2, "Thirty");
            put(3, "Forty");
        }};

        final String advantagePlayer1 = "Advantage player1";
        final String advantagePlayer2 = "Advantage player2";
        final String player1Win = "Win for player1";
        final String player2Win = "Win for player2";
        final String deuce = "Deuce";
        final String all = "All";

        String score;
        if (player1Point > 2 && player2Point > 2) {
            if (player1Point - player2Point == 2) {
                score = player1Win;
            } else if (player2Point - player1Point == 2) {
                score = player2Win;
            } else if (player1Point == player2Point) {
                score = deuce;
            } else {
                if (player1Point > player2Point) {
                    score = advantagePlayer1;
                } else {
                    score = advantagePlayer2;
                }
            }
        } else {
            if (player1Point == 4 || player2Point == 4) {
                score = player1Point == 4 ? player1Win : player2Win;
            } else if (player1Point == player2Point) {
                score = scoreName.get(player1Point) + "-" + all;
            } else {
                score = scoreName.get(player1Point) + "-" + scoreName.get(player2Point);
            }
        }

        return score;
    }

    public void increasePlayer1Score() {
        player1Point++;
    }

    public void increasePlayer2Score() {
        player2Point++;
    }

    @Override
    public void wonPoint(String player) {
        if ("player1".equals(player)) { // avoid NullPointException
            increasePlayer1Score();
        } else {
            increasePlayer2Score();
        }
    }
}
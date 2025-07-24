public class MethodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
        System.out.println("New score is " + calculateScore());
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        return calculateScore("Anonymous", 0);
    }
}

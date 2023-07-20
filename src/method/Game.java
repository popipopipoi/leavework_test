package method;

public class Game {
    public static String rockPaperScissors() {

        int random = (int) (Math.random() * 3);

        return random == 0 ? "가위": random == 1 ? "바위" : "보";
    }

    public static String tossCoin() {

        int random = (int) (Math.random() * 2);

        return random == 0 ? "앞면" : "뒷면";
    }
}

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int dice=(int)(Math.floor(Math.random() * 10 % 6 + 1));
        System.out.println("Rolling a dice  :" +dice);
    }
}

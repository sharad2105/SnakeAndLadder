import java.sql.SQLOutput;
import java.util.Random;

public class SnakeAndLadder {
    private void play(){
        int position =0;
        int count =0;
            int dice=(int)(Math.floor(Math.random() * 10 % 6 + 1));
            System.out.println("Rolling a dice  :" +dice);
            int diceCheck = (int) (Math.random()* dice % 3);
            System.out.println("Dice Checkis :" +diceCheck);

            if(diceCheck == 0 ){
                System.out.println("Player is the Same Position..........");
                count = count+1;
                System.out.println("Position Of Player is.." +position);
            }

            else if(diceCheck == 1){
                System.out.println("player move ahead its Ladder.......");
                position = position+dice;
                System.out.println("current Position of player is...." +position);
                count = count+1;
            }

            else if(diceCheck == 2){
                System.out.println("player move behind Snake");
                position = position-dice;
                System.out.println("current Positio of player is" +position);
            }
            else{
                System.out.println("game is over");
            }
            }
    public static void main(String[] args) {
        SnakeAndLadder game = new SnakeAndLadder();
        game.play();
    }
}

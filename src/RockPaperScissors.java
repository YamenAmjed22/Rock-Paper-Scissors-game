import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> rps = new ArrayList<>();
        rps.add("R"); // R for Rock
        rps.add("P");
        rps.add("S");
        System.out.println("welcome!! ,  pLz , enter your name in this game : ");
        String playerName = scanner.nextLine();
        try {
            Thread.sleep(1000); // 1000 milliseconds = 1 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello " + playerName + " welcome in my game i am so happy to see you here  ");
        while (true) {
            /*in this line we will create random value from 0 to 2 and then get it
            from the rps and this is the computer move */
            String computerMove = rps.get(new Random().nextInt(rps.size()));
            try {
                Thread.sleep(1000); // 3000 milliseconds = 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Please enter your move( R ==> Rock, P ==> Paper, S ==> Scissors ) : ");
            String playerMove;
            while (true) {
                playerMove = scanner.nextLine();
                if (playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S")) {
                    break;
                } else {
                    System.out.println("Sorry!! , the value you entered is not valid check your choice is capital letter or not and tray again PLZ ..... ");
                }
            }
            System.out.println("the computer move is : " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("ooh the game is tie ");
            } else if (playerMove.equals("R")) {
                if (computerMove.equals("S")) {
                    System.out.println("that's good you were win ");
                } else if (computerMove.equals("P")) {
                    System.out.println("oops that's sad you are lose ");
                }
            } else if (playerMove.equals("P")) {
                if (computerMove.equals("R")) {
                    System.out.println("that's good you were win ");
                } else if (computerMove.equals("S")) {
                    System.out.println("oops that's sad you are lose ");
                }
            } else {
                if (computerMove.equals("P")) {
                    System.out.println("that's good you were win ");
                } else if (computerMove.equals("R")) {
                    System.out.println("oops that's sad you are lose ");
                }
            }
            System.out.println("do you want to play again ? (Y/N)");
            String again = scanner.nextLine();
            if (again.equals("N") || again.equals("n") ){
                System.out.println("See you later , good by "+playerName);
                break;
            }
            else if (again.equals("Y") || again.equals("y")){
                continue;
            }
        }
    }
}

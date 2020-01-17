import java.util.Scanner;
import java.util.Random;

class Kazuate {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int ans = rand.nextInt(100);
        int n;
        final int limit = 7;

        System.out.println("Answer correctoly within " + limit + " times.");

        int i;
        for(i = 1; i <= limit; i++){
            System.out.print("input...");
            n = stdIn.nextInt();

            if(n > ans) System.out.println("answer is smaller.");
            else if(n < ans) System.out.println("answer is bigger.");
            else {
                System.out.println("Correct!!");
                System.out.println("You win in " + i + " times answer");
                break;
            }

            if(i == limit){
                System.out.println("You lose");
                System.out.println("Answer is " + ans);
            }
        }

    }
}
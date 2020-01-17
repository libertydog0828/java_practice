import java.util.Scanner;
import java.util.Random;

class RandomPlusMinus5 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner stdInt = new Scanner(System.in);
        int x;

        int random = -5 + rand.nextInt(5);

        System.out.print("imputInt = ");
        x = stdInt.nextInt();

        System.out.println("Random Integer = " + (x + random));
        
    }
}
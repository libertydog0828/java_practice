import java.util.Scanner;
import java.util.Random;

class RandomTester{

    static int random(int a, int b){
        Random rand = new Random();

        if(a >= b) return a;
        else return a + rand.nextInt(b - a + 1);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int top, bottom;
        int rand_value;

        System.out.print("input bottom : ");
        bottom = stdIn.nextInt();

        System.out.print("input top : ");
        top = stdIn.nextInt();

        rand_value = random(bottom, top);
        System.out.printf("random_value : %d\n", rand_value);

    }
}
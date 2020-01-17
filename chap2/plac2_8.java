import java.util.Scanner;

class SumAveDouble {

    public static void main (final String[] args) {

        int x, y;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Integer A : ");
        x = stdIn.nextInt();

        System.out.print("Integer B : ");
        y = stdIn.nextInt();

        System.out.println("Average A and B is " + (x + y)/2);

    }
}
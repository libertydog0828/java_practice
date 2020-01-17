import java.util.Scanner;

class Sign{
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;

        System.out.print("input Integer : ");
        x = stdIn.nextInt();

        if(x > 0) System.out.println("x is positive");
        else if(x == 0) System.out.print("x equal zero");
        else System.out.print("x is negative");

    }
}
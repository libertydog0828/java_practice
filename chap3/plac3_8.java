import java.util.Scanner;

class GoInto5{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;

        System.out.print("input : ");
        x = stdIn.nextInt();

        if(x < 0) {
            System.out.print(x + " is not positive num");
            System.exit(0);
        }

        if(x%5 == 0) System.out.print(x + " is multiple of 5");
        else System.out.print(x + " is not multiple of 5");

    }
}
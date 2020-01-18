import java.util.Scanner;

class Average3A {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int x, y, z;
        double ave;

        System.out.print("input x : ");
        x = stdIn.nextInt();
        System.out.print("input y : ");
        y = stdIn.nextInt();
        System.out.print("input z : ");
        z = stdIn.nextInt();

        ave = (x + y + z)/3.0;

        System.out.printf("Average is %f\n", ave);

    }
}
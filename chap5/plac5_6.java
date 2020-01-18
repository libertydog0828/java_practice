import java.util.Scanner;

class Average3B {
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

        ave = (double)(x + y + z)/3;

        System.out.printf("average = %f\n", ave);
        
    }
}
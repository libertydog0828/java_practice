import java.util.Scanner;

class Max2B{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double A, B;
        double max;

        System.out.print("input A : ");
        A = stdIn.nextDouble();
        System.out.print("input B : ");
        B = stdIn.nextDouble();

        //max = A > B ? A : B;
        max = A < B ? B : A;

        System.out.print("Bigger number is " + max);

    }
}
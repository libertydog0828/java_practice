import java.util.Scanner;

class Min3{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B, C;
        int min;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        System.out.print("input C : ");
        C = stdIn.nextInt();

        min = A;

        if(min > B) min = B;
        if(min > C) min = C;

        System.out.print("Minimum is " + min);
        
    }
}
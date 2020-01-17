import java.util.Scanner;

class Med3{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B, C;
        int med;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        System.out.print("input C : ");
        C = stdIn.nextInt();

        if(A >= C){
            if(B >= C) med = B;
            else if(A <= C) med = A;
            else med = C;
        }
        else if(A > C) med = A;
        else if(B > C) med = C;
        else med = B;

        System.out.print("median = " + med);

    }
}
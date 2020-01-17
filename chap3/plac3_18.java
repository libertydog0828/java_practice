import java.util.Scanner;

class Sort2Descending {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int A, B;
        int tmd;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        tmd = B;

        if(A >= B){
            B = A;
            A = tmd;
        }

        System.out.print("1st = " + A + " 2nd = " + B);

    }
}
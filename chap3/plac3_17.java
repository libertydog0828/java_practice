import java.util.Scanner;

class MinMaxEq {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B;
        int big = 0;
        int small = 0;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        if(A == B) {
            System.out.print("A equal B");
            System.exit(0);
        }

        if(A > B) {
            big = A;
            small = B;
        }
        else{
            big = B;
            small = A;
        }

        System.out.print("bigger is " + big + " smaller is " + small);

    }
}
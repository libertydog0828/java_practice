import java.util.Scanner;

class Sort3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B, C;
        int temp;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        System.out.print("input C : ");
        C = stdIn.nextInt();

        if(A >= B){
            temp = A;
            A = B;
            B = temp;
        }

        if(B >= C){
            temp = B;
            B = C;
            C = temp;
        }

        if(A >= B){
            temp = A;
            A = B;
            B = temp;
        }

        System.out.print("1st = " + A + " 2nd = " + B + " 3rd = " + C);
    }
}
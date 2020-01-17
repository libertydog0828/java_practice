import java.util.Scanner;

class Balance{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B;

        System.out.print("A : ");
        A = stdIn.nextInt();

        System.out.print("B : ");
        B = stdIn.nextInt();

        if(A > B) System.out.print(A + " is begger than " + B);
        else if(A == B) System.out.print(A + " equal " + B);
        else System.out.print(A + " is smaller than " + B);
    }
}
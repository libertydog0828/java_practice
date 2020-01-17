import java.util.Scanner;

class Diff2Digits{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B;
        int diff;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        diff = A > B ? (A - B):(B - A);
        
        if(diff <= 10) System.out.print("|A - B| <= 10");
        else System.out.print("|A - B| > 11");
    }
}
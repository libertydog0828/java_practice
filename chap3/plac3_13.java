import java.util.Scanner;

class Diff2A{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B;
        int diff;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        diff = A > B ? (A - B) : (B - A); 

        System.out.print("Difference of A and B is " + diff);
        
    }
}
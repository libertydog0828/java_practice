import java.util.Scanner;

class OctHex {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        int x;

        System.out.print("input number : ");
        x = stdIn.nextInt();

        System.out.printf("10進数では%dです\n", x);
        System.out.printf(" 8進数では%oです\n", x);
        System.out.printf("16進数では%xです\n", x);
        
    }
}
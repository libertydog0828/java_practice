package chap2;
import java.util.Scanner;

class PlusMinus10 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Integer : ");
        int x = input.nextInt();

        System.out.println("x + 10 = " + (x + 10));
        System.out.println("x - 10 = " + (x - 10));
        
    }
}
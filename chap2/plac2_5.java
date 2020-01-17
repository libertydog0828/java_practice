package chap2;
import java.util.Scanner;

class ScanInteger{

    public static void main (final String[] args) {

        final Scanner input = new Scanner(System.in);

        System.out.print("Integer : ");
        final int x = input.nextInt();

        System.out.println(x + " is input");

    }
}
import java.util.Scanner;

class LowerDigit {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Integer : ");

        int x = input.nextInt();

        System.out.println("最下位を除いた値は " + (x/10) + "です．");
        System.out.println("最下位の値は " + (x%10) + "です．");

    }
}
import java.util.Scanner;

class Pyramid{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("How many steps : ");
        n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n - i; j++){
                 System.out.print(" ");
            }

            for(int k = 0; k < (i - 1)*2 + 1; k++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }

    }
}
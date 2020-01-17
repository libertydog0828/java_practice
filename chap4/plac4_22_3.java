import java.util.Scanner;

class IsoscelesTrianglesRB {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("How many steps : ");
        n = stdIn.nextInt();

        for(int i = 0; i <= n; i++){

            for(int j = 0; j <= n - i; j++){
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}
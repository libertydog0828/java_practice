import java.util.Scanner;

class PutAsterisk5A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("How many * : ");
        n = stdIn.nextInt();

        if(n < 0){
            System.out.print("input number is not effective.");
            System.exit(0);
        }

        for(int i = 0; i < n; i++){
            System.out.print("*");
            if((i + 1)%5 == 0) System.out.print("\n");
        }
    }

}
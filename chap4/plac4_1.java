import java.util.Scanner;

class SignRepeat {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, num;
        int i;

        System.out.print("What times do you wanna input?\nn = ");
        n = stdIn.nextInt();

        for(i = 0; i < n; i++){
            System.out.print("Num = ");
            num = stdIn.nextInt();

            if(num > 0) System.out.print(num + " is positive");
            else if(num == 0) System.out.print(num + " is zero");
            else System.out.print(num + " is negative");

            System.out.println("");
        }

    }
}
import java.util.Scanner;

class Multipleof10{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;

        System.out.print("input : ");
        x = stdIn.nextInt();

        if(x > 0){

            if(x%10 == 0) System.out.print(x + " is multiple of 10.");
            else System.out.print(x + " is not multiple of 10.");
        }
        else System.out.print(x + " is not positive.");
    }
}
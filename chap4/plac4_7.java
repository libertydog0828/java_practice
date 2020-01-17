import java.util.Scanner;

class PutAsterisk{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("What times do you wanna input? : ");
        int n = stdIn.nextInt();

        if(n < 1) System.out.print("");

        do{
            System.out.print("*");
            n--;
        } while(n >= 1);

    }

}
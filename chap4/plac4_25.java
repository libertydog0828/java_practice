import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        int flag = 0;

        System.out.print("input n : ");
        n = stdIn.nextInt();

        if(n <= 1){
            System.out.print("The number is not effective\n");
            System.exit(0);
        }

        for(int i = 2; i < n; i++){
            if(n%i == 0) flag = 1;
        }

        if(flag == 0) System.out.println("The number is Prime.");
        else System.out.println("The number is not Prime.");

    }
}
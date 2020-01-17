import java.util.Scanner;

class Measure{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        int count = 0;

        System.out.print("input n : ");
        n = stdIn.nextInt();

        if(n <= 0){
            System.out.print("input number is not effective");
            System.exit(0);
        }

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                 System.out.println(n/i);
                 count++;
            }
        }

        System.out.print("The number of measure is " + count);
        
    }
}
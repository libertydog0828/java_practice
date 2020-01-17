import java.util.Scanner;

class SumUpFor {
    public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        int n;

        System.out.print("input n : ");
        n = stdIn.nextInt();

        for(int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
}
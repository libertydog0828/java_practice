import java.util.Scanner;

class SumUp1 {
    
    static int sumUp(int n){
        
        int sum = 0;
        for(int i = 0; i < n + 1; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        int sum = 0;
        System.out.print("input n : ");
        n = stdIn.nextInt();

        sum = sumUp(n);
        System.out.printf("sum = %d\n", sum);

    }
}
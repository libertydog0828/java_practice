import java.util.Scanner;

class SumBreak1Ave{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        int num;
        int sum = 0;
        double ave = 0.0;

        System.out.print("How many digit : ");
        n = stdIn.nextInt();

        int i;

        for(i = 0; i < n; i++){
            System.out.print("input = ");
            num = stdIn.nextInt();

            if(num == 0) break;

            sum += num;
        }

        ave = sum/i;

        System.out.print("Total = " + sum + " Average = " + ave);
    }
}
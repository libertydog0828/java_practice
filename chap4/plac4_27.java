import java.util.Scanner;

class SumBreak2Ave {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num;
        double ave;

        System.out.print("Calculate total and average\ninput digits\n");

        do{
            System.out.print("input...");
            num = stdIn.nextInt();
            sum += num;
            count++;
        }while(sum <= 1000);

        System.out.print("Over 1000\tignore last number.\n");

        sum -= num;
        count--;
        ave = sum/count;

        System.out.print("Total = " + sum + " Average = " + ave);
        
    }

}
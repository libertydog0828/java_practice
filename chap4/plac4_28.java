import java.util.Scanner;

class SumContinueAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        int count = 0;
        int num;
        int sum = 0;
        double ave;

        System.out.print("How many digits : ");
        n = stdIn.nextInt();

        int i;

        for(i = 1; i <= n; i++){

            System.out.print("input...");
            num = stdIn.nextInt();

            if(num < 0){
                System.out.println("ignore negative number.");
                continue;
            }

            sum += num;
            count++;
        }

        ave = sum/count;

        System.out.print("total = " + sum + " average = " + ave);

    }
}
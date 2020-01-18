import java.util.Scanner;

class ArraySumAve{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int n;
        double sum , ave;
        System.out.print("The number of Elements : ");
        n = stdIn.nextInt();

        double[] x = new double[n];

        for(int i = 0; i < x.length; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextDouble();
        }

        sum = 0.0;
        ave = 0.0;

        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }

        ave = sum/n;

        System.out.printf("sum = %f\tave = %f\n", sum, ave);

    }
}
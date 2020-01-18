import java.util.Scanner;

class PointSumAve{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        System.out.print("How many students : ");
        n = stdIn.nextInt();

        int[] x = new int[n];
        int max, min;
        int sum;
        double ave;

        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }

        max = x[0];
        min = x[0];
        sum = 0;
        ave = 0.0;
        
        for(int i = 0; i < x.length; i++){
            if(x[i] > max) max = x[i];
            if(x[i] < min) min = x[i];
            sum += x[i];
        }

        ave = (double)sum/(double)n;
    
        System.out.printf("max = %d\tmin = %d\nsum = %d\tave = %f\n", max, min, sum, ave);

    }
    
}
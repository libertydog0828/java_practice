import java.util.Scanner;
import java.util.Random;

class Shuffle{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int n;
        int idx1, idx2;
        int temp;
        final int rand_range = 50;

        System.out.print("The number of Elements : ");
        n = stdIn.nextInt();

        int[] x = new int[n];

        for(int i = 0; i < x.length; i++){
            x[i] = rand.nextInt(rand_range);
            System.out.printf("x[%d] : %d\n", i, x[i]);
        }

        for(int i = 0; i < x.length; i++){
            idx1 = rand.nextInt(n);
            idx2 = rand.nextInt(n);
            
            temp = x[idx1];
            x[idx1] = x[idx2];
            x[idx2] = temp;
        }

        System.out.print("Shuffle\n");
        for(int i = 0; i < x.length; i++) System.out.printf("x[%d] : %d\n", i, x[i]);

    }
}
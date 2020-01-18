import java.util.Scanner;
import java.util.Random;

class ArrayRand{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int n;
        System.out.print("The number of Elements : ");
        n = stdIn.nextInt();

        int[] x = new int[n];
        final int rand_range = 10;

        for(int i = 0; i < x.length; i++){
            x[i] =  1 + rand.nextInt(rand_range);
            System.out.printf("x[%d] : %d\n", i , x[i]);
        }
        
    }

}
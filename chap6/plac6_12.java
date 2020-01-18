import java.util.Scanner;
import java.util.Random;

class ArrayRandY{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int n;
        System.out.print("The number of Elements (under 10): ");
        n = stdIn.nextInt();
        if(n > 11) {
            System.out.println("Error!!");
            System.exit(0);
        }

        int[] x = new int[n];
        final int rand_range = 10;

        for(int i = 0; i < x.length; i++){

            int j;
            do{
                j = 0;
                x[i] = 1 + rand.nextInt(rand_range);
                for( ;j < i; j++){
                    if(x[j] == x[i]) break;
                }
            }while(j < i);

            System.out.printf("x[%d] : %d\n", i , x[i]);
        }
        
    }

}
import java.util.Scanner;
import java.util.Random;

class ColumnChart{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int n;
        int random_value;
        final int random_range = 10;

        System.out.print("The number of elements : ");
        n = stdIn.nextInt();

        int[] x = new int[n];

        for(int i = 0; i < x.length; i++){
            x[i] = 1 + rand.nextInt(random_range);  //random 1 ~ 10//
        }

        for(int i = 1; i <= random_range; i++){
            for(int j = 0; j < x.length; j++){

                if((random_range - x[j]) - i >= 0) System.out.print(" ");
                else System.out.print("*");
            }

            System.out.println();
            if(i == random_range){
                for(int j = 0; j < x.length; j++) System.out.print(j%random_range);
            }

        }

    }
}
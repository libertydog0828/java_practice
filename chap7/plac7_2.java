import java.util.Scanner;

class Min3{

    static int minimum(int a, int b, int c){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;

        return min;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int x, y, z;
        int min;

        System.out.print("input x : ");
        x = stdIn.nextInt();

        System.out.print("input y : ");
        y = stdIn.nextInt();

        System.out.print("input z : ");
        z = stdIn.nextInt();

        min = minimum(x, y, z);

        System.out.printf("minimum = %d\n", min);
        
    }
}
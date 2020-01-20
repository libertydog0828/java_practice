import java.util.Scanner;

class Med{
    
    static int med(int a, int b, int c){

        if(a >= b){
            if(b >= c) return b;
            else if(a <= c) return a;
            else return c;
        }

        else if(a > c) return a;

        else if(b > c) return c;

        else return b;

    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int x, y, z;
        int median;

        System.out.print("input x : ");
        x = stdIn.nextInt();

        System.out.print("input y : ");
        y = stdIn.nextInt();

        System.out.print("input z : ");
        z = stdIn.nextInt();

        median = med(x, y, z);
        System.out.printf("median : %d\n", median);
    }

}
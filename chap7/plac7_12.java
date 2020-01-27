import java.util.Scanner;

class Rotate{

    static Scanner stdIn = new Scanner(System.in);

    static void pointBits(int x){
        for(int i = 31; i >= 0; i--){
            System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
        }
        System.out.println();
    }

    static int rRotate(int n, int x){
        int x_r;

        //Right shift//
        n %= 32;

        return (n == 0 ? x : (x << 0) | (x << (32 - n)));
    }

    public static void main(String[] args){
        int x, n;

        System.out.print("input x : ");
        x = stdIn.nextInt();

        System.out.print("input n : ");
        n = stdIn.nextInt();

        if(n < 0){
            do{
            System.out.println("n is positive number ");
            n = stdIn.nextInt();
            }while(n < 0);
        }
        
        //2bit said//
        pointBits(x);
        System.out.printf("%d right totate is ", n);
        pointBits(rRotate(n, x));
    }

}
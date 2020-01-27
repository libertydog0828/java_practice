import java.util.Scanner;

class ShiftValue{
    static Scanner stdIn = new Scanner(System.in);

    static void multiple2(int x, int n){
        int mult = 1;
        for(int i = 0; i < n; i++){
            mult *= 2;
        }
        System.out.println(x*mult);
    }

    static void divide2(int x, int n){
        int div = 1;
        for(int i = 0; i < n; i++){
            div *= 2;
        }
        System.out.println(x/div);
    }
    public static void main(String[] args){
        int x, n;
        int shiftx_1, shiftx_2;

        System.out.print("input x : ");
        x = stdIn.nextInt();

        System.out.print("n shift : ");
        n = stdIn.nextInt();

        System.out.printf("%d*2^%d = ", x, n);
        multiple2(x, n);

        System.out.printf("%d/(2^%d) = ", x, n);
        divide2(x, n);

        System.out.printf("%d left shift %d = %d\n", x, n, x<<n);
        System.out.printf("%d right shift %d = %d\n", x, n, x>>n);
        
    }
}
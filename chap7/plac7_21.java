import java.util.Scanner;

class AryExchange {

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("Ary[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
    }

    static void SwapArray(int[] a, int[] b, int idx){
        int tmp;

        for(int i = 0; i < idx; i++){
            tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }
    }

    public static void main(String[] args){
        int n_x;
        int n_y;
        int n;
        int[] x;
        int[] y;

        do{
            System.out.print("The num of arrayX elements(positive num) : ");
            n_x = stdIn.nextInt();
        }while(n_x <= 0);

        x = new int[n_x];
        InputArray(x);

        do{
            System.out.print("The num of arrayY elements(positive num) : ");
            n_y = stdIn.nextInt();
        }while(n_y <= 0);

        y = new int[n_y];
        InputArray(y);

        n = n_x;
        if(n > n_y) n = n_y;

        SwapArray(x, y, n);

        System.out.println("Swap Array X, Array Y");
        for(int i = 0; i < n_x; i++) System.out.printf("x[%d] : %d\n", i, x[i]);
        for(int i = 0; i < n_y; i++) System.out.printf("y[%d] : %d\n", i, y[i]);

    }
}
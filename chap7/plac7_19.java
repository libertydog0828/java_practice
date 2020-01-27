import java.util.Scanner;

class AryRmvn{

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] = ", i);
            x[i] = stdIn.nextInt();
        }
    }

    static void RemoveNArray(int[] a, int top_idx, int shift_num){
        for(int i = top_idx; i < top_idx + shift_num; i++){
            if(i + shift_num < a.length) a[i] = a[i + shift_num];
            else a[i] = a[i];
        }   
    }

    public static void main(String[] args){
        int n;
        int shift;
        int top_idx;

        do{
            System.out.print("input the number of index(positive num) : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        int[] a = new int[n];

        InputArray(a);

        do{
            System.out.print("Top index : ");
            top_idx = stdIn.nextInt();
        }while(top_idx < 0 || top_idx >= n);

        do{
            System.out.print("shift(positive num) : ");
            shift = stdIn.nextInt();
        }while(n < 0);

        RemoveNArray(a, top_idx, shift);

        for(int i = 0; i < a.length; i++) System.out.printf("a[%d] = %d\n", i, a[i]);
    }

}
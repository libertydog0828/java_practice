import java.util.Scanner;

class AryRmv{
    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] = ", i);
            x[i] = stdIn.nextInt();
        }
    }

    static void RemoveArray(int[] x, int idx){
        for(int i = idx; i < x.length - 1; i++){
            x[i] = x[i + 1];
        }
    }

    public static void main(String[] args){
        int n;
        int rem_idx;

        do{
        System.out.print("The number of index(positive number) : ");
        n = stdIn.nextInt();
        }while (n <= 0);

        //Array//
        int[] a = new int[n];

        InputArray(a);

        System.out.print("Remove index : ");
        rem_idx = stdIn.nextInt();

        while(rem_idx <= 0 && rem_idx > n){
            System.out.print("input num is vaild\n");
            System.out.print("Remove index : ");
            rem_idx = stdIn.nextInt();
        }

        RemoveArray(a, rem_idx);

        for(int i = 0; i < a.length; i++) System.out.printf("a[%d] = %d\n", i, a[i]);

    }
}
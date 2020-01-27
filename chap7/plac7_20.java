import java.util.Scanner;

class AryIns {

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
    }

    static void InsertArray(int[] x, int ins_idx, int ins_num){
        if(ins_idx != x.length - 1){
            for(int i = x.length - 1; i > ins_idx; i--){
                x[i] = x[i - 1];
            }
        }
        x[ins_idx] = ins_num;
    }

    public static void main(String[] args){
        int n;
        int[] x;
        int ins_idx;
        int ins_num;

        do{
            System.out.print("input num of element : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        x = new int[n];

        InputArray(x);

        do{
            System.out.print("Insert index : ");
            ins_idx = stdIn.nextInt();
        }while(ins_idx < 0 || ins_idx >= n);

        System.out.print("Insert number : ");
        ins_num = stdIn.nextInt();

        InsertArray(x, ins_idx, ins_num);

        for(int i = 0; i < x.length; i++) System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}
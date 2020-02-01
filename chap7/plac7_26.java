import java.util.Scanner;

class ArrayInsOf{
    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d] : ", i);
            array[i] = stdIn.nextInt();
        }
    }

    static int[] InsArray(int[] x, int i_idx, int i_num){
        int[] y = new int[x.length + 1];

        for(int i = 0; i < y.length; i++){

            if(i < i_idx) y[i] = x[i];
            else if(i == i_idx) y[i] = i_num;
            else y[i] = x[i - 1];

        }

        return y;
    }

    public static void main(String[] args){
        int n;
        int[] a;
        int ins_idx, ins_num;
        int[] b;

        do{
            System.out.print("The number of Elements : ");
            n = stdIn.nextInt();
        } while(n <= 0);

        a = new int[n];
        InputArray(a);

        do{
            System.out.print("Insert index : ");
            ins_idx = stdIn.nextInt();
        } while(ins_idx < 0 || ins_idx > a.length - 1);

        System.out.print("Insert number : ");
        ins_num = stdIn.nextInt();

        b = InsArray(a, ins_idx, ins_num);

        for(int i = 0; i < b.length; i++) System.out.printf("b[%d] : %d\n", i, b[i]);
    }
}
import java.util.Scanner;

class ArrayRmvOfN{
    
    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("array[%d] = ", i);
            array[i] = stdIn.nextInt();
        }
    }

    static int[] RemoveArray(int[] a, int idx, int n){
        int i;
        int[] b;
        b = new int[a.length - n];

        for(i = 0; i < idx; i++){
            b[i] = a[i];
        }
        
        for(i = idx; i < a.length - n; i++){
            b[i] = a[i + n];
        }
        return b;
    }

    public static void main(String[] args){
        int n;
        int rmv_idx, rmv_n;
        int[] a, b;
        do{
            System.out.print("The number of Elements (positive num) : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        a = new int[n];

        InputArray(a);

        do{
            System.out.printf("Input remove index(Top) : ");
            rmv_idx = stdIn.nextInt();
        }while(rmv_idx < 0 || rmv_idx >= a.length);

        do{
            System.out.print("How many indexes do remove(positive num) : ");
            rmv_n = stdIn.nextInt();
        }while(rmv_n + rmv_idx < 0 || rmv_n + rmv_idx >= a.length);

        b = RemoveArray(a, rmv_idx, rmv_n);

        for(int i = 0; i < b.length; i++) System.out.printf("b[%d] : %d\n", i, b[i]);
        
    }
}
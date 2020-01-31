import java.util.Scanner;

class ArrayRmvOf{
    
    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("array[%d] = ", i);
            array[i] = stdIn.nextInt();
        }
    }

    static int[] RemoveArray(int[] array, int idx){
        int i;
        int count = 0;
        int[] ret_array = new int[array.length - 1];

        for(i = 0; i < array.length; i++){
            if(i == idx) {
                count++;
                break;
            }

            ret_array[i] = array[i];
            count++;
        }

        System.out.println(count);

        if(count != array.length - 1){
            for(i  = count; i < array.length; i++)
            ret_array[i - 1] = array[i];
        }

        return ret_array;
    }

    public static void main(String[] args){
        int n;
        int[] a;
        int rmv_idx;
        int[] b;
        
        do{
            System.out.print("The number of Element(positive num) : ");
            n = stdIn.nextInt();
        }while(n <= 1);

        a = new int[n];

        InputArray(a);

        do{
            System.out.print("Remove index : ");
            rmv_idx = stdIn.nextInt();
        } while(rmv_idx < 0 || rmv_idx >= n);

        b = RemoveArray(a, rmv_idx);

        for(int i = 0; i < b.length; i++) System.out.printf("b[%d] = %d\n", i, b[i]);

    }
}
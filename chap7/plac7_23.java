import java.util.Scanner;

class ArraySearchIndex{

    static Scanner stdIn = new Scanner(System.in);

    static int[] arraysrchIdx(int[] array, int x){
        int count = 0;
        int[] ret_array;
        int[] clone_array = new int[array.length];
        int temp;

        for(int i = 0; i < array.length; i++){
            if(array[i] == x) {
                clone_array[count] = i;
                count++;
            }
        }

        ret_array = new int[count];

        for(int i = 0; i < ret_array.length; i++){
            ret_array[i] = clone_array[i];
        }

        return ret_array;
    }

    static void InputArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("array[%d] : ", i);
            array[i] = stdIn.nextInt();
        }
    }

    public static void main(String[] args){
       int n;
       int[] a, b;
       int srch_num;

       do{
           System.out.print("The number of Element (positive num) : ");
           n = stdIn.nextInt();
       } while(n <= 0);

       a = new int[n];
       InputArray(a);

       System.out.print("Serach num : ");
       srch_num = stdIn.nextInt();

       b = arraysrchIdx(a, srch_num);

       if(b.length != 0){
        for(int i = 0; i < b.length; i++) System.out.printf("b[%d] = %d\n", i, b[i]);
       }
       else System.out.printf("%d is not exist.\n", srch_num);

    }
}
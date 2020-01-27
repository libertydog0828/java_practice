import java.util.Scanner;

class ArrayClone {
    
    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("Array[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
    }

    static int[] Clone(int[] x){
        int[] y = new int[x.length];
        
        for(int i = 0; i < x.length; i++){
            y[i] = x[i];
        }

        return y;
    }

    public static void main(String[] args){
        int n;
        int[] x;
        int[] y;

        do{
            System.out.print("The num of elements (positive num) : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        x = new int[n];
        InputArray(x);

        y = Clone(x);

        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] : %d\ty[%d] : %d\n", i, x[i], i, y[i]);
        }
        
    }
}
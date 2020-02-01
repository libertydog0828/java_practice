import java.util.Scanner;

class Min{

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.printf("%d : ", i);
            Array[i] = stdIn.nextInt();
        }
    }

    static int min(int a, int b){
        int min = a;

        if(b < min) min = b;

        return min;
    }

    static int min(int a, int b, int c){
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    static int min(int[] a){
        int min = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < min) min = a[i];
        }

        return min;
    }

    public static void main(String[] args){
        int x, y, z;
        int n;
        int[] a;

        System.out.print("Input x : ");
        x = stdIn.nextInt();
        System.out.print("Input y : ");
        y = stdIn.nextInt();
        System.out.print("Input z : ");
        z = stdIn.nextInt();

        do{
            System.out.print("The number of Elements : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        a = new int[n];
        InputArray(a);

        System.out.printf("minimum of a and b : %d\n", min(x, y));
        System.out.printf("minimum of a, b and c : %d\n", min(x, y, z));
        System.out.printf("minimum of Array a : %d\n", min(a));

    }
}
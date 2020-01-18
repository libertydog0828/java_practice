import java.util.Scanner;

class CopyArrayReverse{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        System.out.print("The number of Elements : ");
        n = stdIn.nextInt();

        int[] A, B;
        A = new int[n];
        B = new int[n];

        for(int i = 0; i < n; i++){
            System.out.printf("A[%d] : ", i);
            A[i] = stdIn.nextInt();
        }

        for(int i = 0; i < n; i++){
            B[n - i - 1] = A[i];
        }

        System.out.print("Copy and Reverse\n");

        for(int i = 0; i < n; i++) System.out.printf("B[%d] : %d\n", i, B[i]);

    }
}
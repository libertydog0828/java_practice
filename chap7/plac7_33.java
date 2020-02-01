import java.util.Scanner;

class PrintArray{

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.printf("%d : ", i);
            Array[i] = stdIn.nextInt();
        }
    }

    static void InputMat(int[][] Mat){
        for(int i = 0; i < Mat.length; i++){
            for(int j = 0; j < Mat[i].length; j++){
                System.out.printf("[%d][%d] : ", i, j);
                Mat[i][j] = stdIn.nextInt();
            }
        }
    }

    static void printArray(int[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.printf("%d\t", Array[i]);
        }
    }

    static void printArray(int[][] Mat){
        for(int i = 0; i < Mat.length; i++){
            for(int j = 0; j < Mat[i].length; j++){
                System.out.printf("%d\t", Mat[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        int n;
        int line, column;
        int[] a;
        int[][] b;

        do{
            System.out.print("Array length : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        do{
            System.out.print("Matrix line : ");
            line = stdIn.nextInt();
            System.out.print("Matrix column : ");
            column = stdIn.nextInt();
        }while(line <= 0 || column <= 0);

        a = new int[n];
        b = new int[line][column];

        InputArray(a);
        InputMat(b);

        printArray(a);
        System.out.println("");
        printArray(b);

    }
}
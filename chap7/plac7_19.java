import java.util.Scanner;

class AryRmvn{

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] = ", i);
            x[i] = stdIn.nextInt();
        }
    }

    public static void main(String[] args){
        int n;

        do{
            System.out.print("input the number of index(positive num) : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        int[] a = new int[n];
    }

}
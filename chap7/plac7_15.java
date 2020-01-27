import java.util.Scanner;

class SumOf1{
    
    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
    }

    static int SumArray(int[] x){
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        return sum;
    }

    public static void main(String[] args){
        
        int n;
        int sum;
        System.out.print("input number of element : ");
        n = stdIn.nextInt();

        int[] a = new int[n];

        InputArray(a);

        System.out.print("Sum of Array is " + SumArray(a));

    }

}
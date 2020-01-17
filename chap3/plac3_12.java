import java.util.Scanner;

class Max2A{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        double A;
        double B;
        double max;

        System.out.print("input real A : ");
        A = stdIn.nextDouble();

        System.out.print("input real B : ");
        B = stdIn.nextDouble();

        if(A >= B) max = A;
        else max = B;

        System.out.print("Bigger number is " + max);
    }
}
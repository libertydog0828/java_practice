import java.util.Scanner;

class FloatDoubleScanPrint {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        float f;
        double d;

        System.out.print("f is float type.\t d is double type.\n");

        System.out.print("input f : ");
        f = stdIn.nextFloat();

        System.out.print("input d : ");
        d = stdIn.nextDouble();

        System.out.print("f = " + f + "\nd = " + d + "\n");
        
    }
}
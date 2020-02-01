import java.util.Scanner;

class Absolute{

    static Scanner stdIn = new Scanner(System.in);

    static int absolute(int x){
        int abs;
        return abs = x >= 0 ? x:-x;
    }
    static long absolute(long x){
        long abs;
        return abs = x >= 0 ? x:-x;
    }
    static float absolute(float x){
        float abs;
        return abs = x >= 0 ? x:-x;
    }
    static double absolute(double x){
        double abs;
        return abs = x >= 0 ? x:-x;
    }

    public static void main(String[] args){
        int a;
        long b;
        float c;
        double d;

        System.out.print("Input int a : ");
        a = stdIn.nextInt();
        System.out.print("Input long b : ");
        b = stdIn.nextLong();
        System.out.print("Input float c : ");
        c = stdIn.nextFloat();
        System.out.print("Input double d : ");
        d = stdIn.nextDouble();

        System.out.printf("Absolute a : %d\n", absolute(a));
        System.out.printf("Absolute b : %d\n", absolute(b));
        System.out.printf("Absolute c : %f\n", absolute(c));
        System.out.printf("Absolute d : %f\n", absolute(d));
    }

}
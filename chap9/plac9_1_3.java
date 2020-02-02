import java.util.Scanner;

class CoordinateTester3{

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(Coordinate[] Array){
        double x, y;
        for(int i = 0; i < Array.length; i++){
            Array[i] = new Coordinate(0.0, 0.0);
            System.out.print("x : ");
            x = stdIn.nextDouble();
            System.out.print("y : ");
            y = stdIn.nextDouble();
            Array[i].set(x, y);
            System.out.printf("[%d] (%f\t%f)\n", i, Array[i].getX(), Array[i].getY());
        }
    }

    public static void main(String[] args){
        Coordinate[] p;
        int n;

        do{
            System.out.print("Input Array length : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        p = new Coordinate[n];
        System.out.print("input coordinate\n");

        InputArray(p);

    }
    
}
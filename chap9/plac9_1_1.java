import java.util.Scanner;

class CoordinateTester{

    static Scanner stdIn = new Scanner(System.in);

    public static void main(String[] args){

        double x, y;
        Coordinate p = new Coordinate(0.0, 0.0);
        System.out.print("Input coordinate p\n");
        System.out.print("p_x : "); x = stdIn.nextDouble();
        System.out.print("p_y : "); y = stdIn.nextDouble();
        p.set(x, y);
        

        System.out.printf("p_x : %f\tp_y : %f\n", p.getX(), p.getY());

        Coordinate q = p;
        q.set(9.0, 9.0);

        System.out.printf("p_x : %f\tp_y : %f\n", p.getX(), p.getY());
        System.out.printf("q_x : %f\tq_y : %f\n", q.getX(), q.getY());

    }

}
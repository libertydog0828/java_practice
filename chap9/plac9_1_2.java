import java.util.Scanner;

class CoordinateTester2{

    static Scanner stdIn = new Scanner(System.in);

    static boolean comCoordinate(Coordinate c1, Coordinate c2){
	return (c1.getX() == c2.getX()) && (c1.getY() == c2.getY());
    }

    public static void main(String[] args){
	Coordinate p = new Coordinate(0.0, 0.0);
	Coordinate q = new Coordinate(0.0, 0.0);
	double x, y;
	
	System.out.print("Input coordinate p\n");
	System.out.print("p_x : ");
	x = stdIn.nextDouble();
	System.out.print("p_y : ");
	y = stdIn.nextDouble();
	p.set(x, y);
	System.out.printf("p_x : %f\tp_y : %f\n", p.getX(), p.getY());

	System.out.print("Input coordinate q\n");
	System.out.print("q_x : ");
	x = stdIn.nextDouble();
	System.out.print("q_y : ");
	y = stdIn.nextDouble();
	q.set(x, y);
	System.out.printf("q_x : %f\tq_y : %f\n", q.getX(), q.getY());

	if(comCoordinate(p, q)){
	    System.out.println("p == q");
	}
	else System.out.println("p != q");
    }

}

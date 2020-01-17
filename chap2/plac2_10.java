//Volume and Area of Sphere
import java.util.Scanner;

class Globe {

    public static void main (final String[] args){
        
        final double PI = 3.141592;
        double R;
        Scanner input_Radius = new Scanner(System.in);

        System.out.print("Radius = ");

        R = input_Radius.nextDouble();

        System.out.println("Area of Sphere = " + (4.0*PI*R*R));
        System.out.print("Volume of Sphere = " + (4.0/3.0*PI*R*R*R));
        
    }

}
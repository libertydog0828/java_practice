import java.util.Scanner;

class Triangle {

    public static void main (String[] args) {
        Scanner input_Base = new Scanner(System.in);
        Scanner input_Height = new Scanner(System.in);

        double Base, Height;

        System.out.print("Length of Base = ");
        Base = input_Base.nextDouble();
        
        System.out.print("Length of Height = ");
        Height = input_Height.nextDouble();

        System.out.println("Surface of Triangle = " + Base*Height/2.0);

    }

}
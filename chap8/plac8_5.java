import java.util.Scanner;

class CarTester2{

    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        Car myCar;

        System.out.print("Input Car info\n");
        System.out.print("Car name : "); String name = stdIn.next();
        System.out.print("Car number : "); String number = stdIn.next();
        System.out.print("width : "); int width = stdIn.nextInt();
        System.out.print("heigth : "); int height = stdIn.nextInt();
        System.out.print("length : "); int length = stdIn.nextInt();
        System.out.print("tankage : "); double tank = stdIn.nextDouble();
        System.out.print("fuel : "); double fuel = stdIn.nextDouble();
        System.out.print("pecific Fuel Consumption : "); double sfc = stdIn.nextDouble();

        myCar = new Car(name, number, width, height, length, tank, fuel, sfc);

        while(true) {
            System.out.printf("Current location : %f\t%f\n", myCar.getX(), myCar.getY());
            System.out.printf("Remaining fuel : %f\n", myCar.getFuel());
            System.out.printf("Move?\n0-->NO\t1-->YES\n");
            if(stdIn.nextInt() == 0) break;

            System.out.print("Moving distance of x : ");
            double dx = stdIn.nextDouble();
            System.out.print("Moving distance of y : ");
            double dy = stdIn.nextDouble();

            if(!myCar.move(dx, dy)){
                System.out.print("Fuel shortage!\n");
            }
        }
    }
}
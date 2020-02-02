import java.util.Scanner;

class CoordinateTester{
    static Scanner stdIn = new Scanner(System.in);

    public static void main(String[] args){
        int n;
        Coordinate2[] a;
        Coordinate2 p, q, c1, c2;

        System.out.print("input x : ");
        double x = stdIn.nextDouble();
        System.out.print("input y : ");
        double y = stdIn.nextDouble();

        p = new Coordinate2(x, y);
        System.out.println("p : " + p);
        q = new Coordinate2(p);
        System.out.println("same coordiate q.");
        System.out.println("q : " + q);

        if(p.equalTo(q)) System.out.print("same coordinate\n");
        else System.out.print("difference coordinate\n");

        c1 = new Coordinate2();
        c2 = new Coordinate2(1.0, -3.0);

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);

        do{
            System.out.print("Array length : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        a = new Coordinate2[n];
        for(int i = 0; i < a.length; i++){
            a[i] = new Coordinate2();
            System.out.println("a[" + i + "] : " + a[i]);
        }

    }
}
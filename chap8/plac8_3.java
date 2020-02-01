class Car{
    private String name;
    private String number;
    private int width;
    private int height;
    private int length;
    private double X;
    private double Y;
    private double tankage;
    private double fuel;
    private double sfc;

    //constructer//
    Car(String n, String num, int w, int h, int l,
    double t, double f, double s)
    {
        name = n; number = num;
        width = w; height = h; length = l;
        X = 0.0; Y = 0.0; tankage = t; fuel = f; sfc = s;
    }

    double getX() { return X; };
    double getY() { return Y; };
    double getFuel() { return fuel; };

    void putSpec() {
        System.out.printf("name : %s\n", name);
        System.out.printf("number : %s\n", number);
        System.out.printf("width : %d\n", width);
        System.out.printf("height : %d\n", height);
        System.out.printf("length : %d\n", length);
        System.out.printf("tankage : %f\n", tankage);
        System.out.printf("fuel : %f\n", fuel);
        System.out.printf("pecific Fuel Consumption : %f\n", sfc);
    }

    boolean move(double dx, double dy){
        double dist = Math.sqrt(dx*dx + dy*dy);
        double f = dist/sfc;

        if(f > sfc) return false;
        else{
            fuel -= f;
            X += dx;
            Y += dy;
            return true;
        }
    }

    //Refueling//
    void refueling(double df){
        if(df > 0){
            fuel += df;
            if(fuel > tankage){
                fuel = tankage;
            }
        }
    }
    
}


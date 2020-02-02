class Coordinate{
    private double X;
    private double Y;

    //constructer//
    Coordinate(double X, double Y){
        this.X = X; this.Y = Y;
    }

    double getX() { return X; };
    double getY() { return Y; };

    void set(double X, double Y) { this.X = X; this.Y = Y; }
    
}
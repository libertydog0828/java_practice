public class Coordinate2{
    private double X = 0.0;
    private double Y = 0.0;

    //constructer//
    public Coordinate2() {};
    public Coordinate2(double x, double y) { set(x, y); }
    public Coordinate2(Coordinate2 c) { this(c.X, c.Y); }

    public void set(double x, double y){ this.X = x; this.Y = y; }
    public double getX() { return this.X; }
    public double getY() { return this.Y; }

    public boolean equalTo(Coordinate2 c) { return X == c.X && Y == c.Y; }
    
    public String toString() { return "(" + X + " , " + Y + ")"; }

}
class SquareFloat{
    public static void main(String[] args){
        System.out.println("x\tx square");
        System.out.println("______________");

        float diff_x = 0.001F;

        for(float x = 0.0F; x <= 1.0F; x += diff_x){
            System.out.printf("%5.3f\t%10.7f\n", x, x*x);
        }

    }
}
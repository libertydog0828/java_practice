class LoopFloatInt {
    public static void main(String[] args) {
        
        System.out.println("Float\tInt");
        System.out.println("-------------------");

        float x_f = 0.0F;

        for(int i = 0; i <= 1000; i++, x_f += 0.001F){
            System.out.printf("%9.7f\t%9.7f\n", x_f, (float)i/1000);
        }

    }
}
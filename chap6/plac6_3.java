class DoubleArrayFor{
    public static void main(String[] args){
        double[] x = new double[5];

        for(int i = 0; i < x.length; i++){
            x[i] = (i + 1)*1.1;
            System.out.printf("x[%d] = %f\n", i, x[i]);
        }

    }
    
}
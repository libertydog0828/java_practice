class IntArrayFor {
    public static void main(String[] args) {
        int[] x = new int[5];

        for(int i = 0; i < x.length; i++){
            x[i] = x.length - i;
            System.out.printf("x[%d] = %d\n", i, x[i]);
        }

    }
}
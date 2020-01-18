class IntArray12345 {
    public static void main(String[] args){
        int[] a = new int[5];

        for(int i = 0; i < a.length; i++){
            a[i] = a.length - i;
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

    }
}
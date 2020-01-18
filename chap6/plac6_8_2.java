import java.util.Scanner;


class LinearSearchBottom{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        int key;
        int key_bottom;
        System.out.print("The number of Elements : ");
        n = stdIn.nextInt();

        int[] x = new int[n];
        
        for(int i = 0; i < x.length; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }

        System.out.print("Searc number : ");
        key = stdIn.nextInt();

        key_bottom = 0;
        for(int i = n - 1; i > 1; i--){
            if(x[i] == key) {
                key_bottom = i;
                break;
            }
        }

        if(key_bottom == 0) System.out.print("The number does't exist\n");
        else System.out.printf("x[%d]\n", key_bottom);
    }
}
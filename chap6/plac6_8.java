import java.util.Scanner;


class LinearSearchTop{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        int key;
        int key_top;
        System.out.print("The number of Elements : ");
        n = stdIn.nextInt();

        int[] x = new int[n];
        
        for(int i = 0; i < x.length; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }

        System.out.print("Searc number : ");
        key = stdIn.nextInt();

        key_top = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] == key) {
                key_top = i;
                break;
            }
        }

        if(key_top == 0) System.out.print("The number does't exist\n");
        else System.out.printf("x[%d]\n", key_top);
    }
}
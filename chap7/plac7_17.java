import java.util.Scanner;

class LinearSearch{

    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
    }

    static int linearSearch(int[] x, int key){
        for(int i = 0; i < x.length; i++){
            if(x[i] == key) return i;
        }
        return -1;
    }

    static int linearSearchR(int[] x, int key){
        for(int i = x.length - 1; i >= 0; i--){
            if(x[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int n;
        int key;
        int Topidx, Bottomidx;

        do{
            System.out.print("input number of elements(positive num) : ");
            n = stdIn.nextInt();
        }while(n < 0);

        int[] x = new int[n];

        InputArray(x);
        
        System.out.print("Search number : ");
        key = stdIn.nextInt();

        Topidx = linearSearch(x, key);
        Bottomidx = linearSearchR(x, key);

        if(Topidx == -1 || Bottomidx == -1){
            System.out.printf("%d is not exist\n", key);
            System.exit(0);
        }

        if(Topidx != Bottomidx){
            System.out.printf("%d is multiple\n", key);
            System.out.printf("Top number is x[%d]\n", Topidx);
            System.out.printf("Bottom number is x[%d]\n", Bottomidx);
        }
        else System.out.printf("%d is x[%d]\n", Topidx);

    }
}
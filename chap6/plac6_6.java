import java.util.Scanner;

class PrintArray {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        System.out.print("The number of Elements : ");
        n = stdIn.nextInt();
        
        int[] x = new int[n];

        for(int i = 0; i < x.length; i++){
            System.out.print(i + " : ");
            x[i] = stdIn.nextInt();
        }

        for(int i = 0; i < x.length; i++){
            if(i == 0) System.out.print("{");
            System.out.printf("%d", x[i]);
            if(i == (x.length - 1)) {
                System.out.print("}");
                continue;
            }
            System.out.print(", ");
        }

    }
}
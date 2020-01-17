import java.util.Scanner;

class IsoscelesTrianglesRU{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("How many steps : ");
        n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = i; k <= n; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
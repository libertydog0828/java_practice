import java.util.Scanner;

class IsoscelesTrianglesLU {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("How many steps : ");
        n = stdIn.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
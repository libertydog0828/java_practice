import java.util.Scanner;

class IsoscelesTriangleLB {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("How many steps : ");
        n = stdIn.nextInt();

        for(int i = 1; i < n+1;i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
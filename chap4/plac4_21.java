import java.util.Scanner;

class Square{
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("How many steps : ");
        n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
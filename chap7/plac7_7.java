import java.util.Scanner;

class IsoscelessTriangleLB{

    static void putStars(int n, String c){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.printf("%s", c);
            }
            System.out.println();
        }
    }

    static void putChars(int n){
        putStars(n, "*");
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("Put number : ");
        n = stdIn.nextInt();

        putChars(n);
    }
}
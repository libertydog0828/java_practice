import java.util.Scanner;

class Square2{
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("input n : ");
        n = stdIn.nextInt();

        for(int i = 1, j = 1; i <= n; i++, j=i*i){
            System.out.println("Square " + i + " : " + j);
        }

    }
}
import java.util.Scanner;

class Square1{
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("input n : ");
        n = stdIn.nextInt();

        for(int i = 1; i < n+1; i++){
            System.out.println("Square " + i + " : " + i*i);
        }
    }
}
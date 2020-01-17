import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int ceiling;
        int ans = 1;
        int i;

        System.out.print("input ceiling : ");
        ceiling = stdIn.nextInt();

        if(ans < 1) System.out.print("input positive value\n");

        for(i = 1; i <= ceiling; i++){
            ans *= i;
        }

        System.out.println("Answer is " + ans);
    }

}
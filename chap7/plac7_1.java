import java.util.Scanner;

class Signf1 {
    static int Signf(int x){
        int sign = 0;

        if(x > 0){
            sign = 1;
        }
        else if(x < 0){
            sign = -1;
        }
        return sign;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x;
        System.out.println("input x : ");
        x = stdIn.nextInt();

        int sign = 0;

        sign = Signf(x);

        System.out.print(sign);
    }
}
import java.util.Random;
import java.util.Scanner;

class ThreeDigits{
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int flag, Num;

        flag = 0;

        do{
            System.out.print("input three digits : ");
            Num = stdIn.nextInt();

            if(Num >= 100 && Num <= 999) flag = 1;
        } while(flag == 0);

    }
    
}
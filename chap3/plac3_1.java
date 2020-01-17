//judging positive or negative//

import java.util.Scanner;

class Negative{
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int x;

        System.out.println("input Integer : ");
        x = stdIn.nextInt();

        if(x < 0) System.out.println(x + " is negative number.");

    }
}
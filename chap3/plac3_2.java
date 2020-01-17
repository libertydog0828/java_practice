//absolute

import java.util.Scanner;

class Absolute {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int x;
        int abs_x;

        System.out.print("input Integer : ");
        x = stdIn.nextInt();

        if(x < 0) abs_x = -x;
        else abs_x = x;

        System.out.println("Absolute " + x + " is " + abs_x);

    }
}
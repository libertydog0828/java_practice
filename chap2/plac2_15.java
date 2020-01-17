// initialize Strings and input Strings//

import java.util.Scanner;

class StringTester {

    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = "XYZ";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        Scanner stdIn = new Scanner(System.in);

        System.out.print("input s1 : ");
        s1 = stdIn.next();

        System.out.print("input s2 : ");
        s2 = stdIn.next();

        System.out.println("s1 = " + s1 + " s2 = " + s2);
        
    }
}
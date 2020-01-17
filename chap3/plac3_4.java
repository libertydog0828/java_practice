//x is divisor or not divisor//

import java.util.Scanner;

class measure2{
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int A;
        int B;

        System.out.print("A = ");
        A = stdIn.nextInt();

        System.out.print("B = ");
        B = stdIn.nextInt();

        if(A%B != 0){
            System.out.println("B isn't divisor of A");
        }

        else{
            System.out.println("B is divisor of A");
        }
    }
}
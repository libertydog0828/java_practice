// input first and last name and Greeting//

import java.util.Scanner;

class Greeting{

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        System.out.print("Last name : ");
        String Last_name = stdIn.next();
        
        System.out.print("First name : ");
        String First_name = stdIn.next();

        System.out.print("こんにちは" + Last_name + First_name + "さん.");
        
    }
}
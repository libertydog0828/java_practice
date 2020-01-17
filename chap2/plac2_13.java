//generate random real//
import java.util.Random;
import java.util.Scanner;


class RandomDouble{
    public static void main (String[] args) {

        Random rand = new Random();

        double randomA = rand.nextDouble(); 
        double randomB = 10.0*rand.nextDouble();
        double randomC = 1.0 - 2.0*rand.nextDouble();

        System.out.println("random 0.0 ~ 1.0 = " + randomA);
        System.out.println("random 0.0 ~ 10.0 = " + randomB);
        System.out.println("random -1.0 ~ 1.0 = " + randomC);
        
    }
}
//make random

import java.util.Scanner;
import java.util.Random;

class RandomInteger {

    public static void main(String[] args) {

        Random rand = new Random();

        int n1 = 1 + rand.nextInt(9);  //random(1 ~ 9)//
        int n2 = -1 - rand.nextInt(9);  //random(-1 ~ -9)//
        int n3 = 10 + rand.nextInt(90);  //random(10 ~ 99)//

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

    }
}
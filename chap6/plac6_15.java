import java.util.Scanner;
import java.util.Random;

class MonthCAI{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        String[]  month_string = {
            "Janualy", "February", "March", "April",
            "May", "June", "July", "August" , "September",
            "October", "November", "December"
        };

        System.out.println("imput Month in English");

        int flag = 1;
        int last_month = 0;
        int month = 0;

        do{
            do{
                month = 1 + rand.nextInt(12);
            } while(month == last_month);
            last_month = month;

            System.out.print(month + "月 : ");

            String ans_month = stdIn.next();
            if(month_string[month - 1].equals(ans_month)) System.out.println("Correct.");
            else System.out.println("Incorrect.");

            System.out.println("retry? : Yes => 1\tNo => 0");
            flag = stdIn.nextInt();
            if(flag != 0 && flag != 1){
                System.out.println("value is invalid.");
                do{
                    System.out.println("retry? : Yes => 1\tNo => 0");
                    flag = stdIn.nextInt();
                } while(flag != 0 && flag != 1);
            }
        } while(flag == 1);

    }
}
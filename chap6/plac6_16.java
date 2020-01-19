import java.util.Scanner;
import java.util.Random;

class DayCAI {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        String[] Day_japanese = {
            "日", "月", "火", "水", "木", "金", "土"
        };

        String[] Day_string = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Fryday", "Saturday"
        };

        System.out.println("input Day in English.");

        int flag = 1;
        int last_day = -1;
        int day;
        String Ans_day;

        do{
            do{
                day = rand.nextInt(7);
            }while(day == last_day);
            last_day = day;

            System.out.printf("%s曜日 : ", Day_japanese[day]);

            Ans_day = stdIn.next();

            if(Ans_day.equals(Day_string[day])) System.out.println("Correct.");
            else System.out.println("Incorrect.");

            System.out.println("retry? Yes=>1\tNo=>0");
            flag = stdIn.nextInt();

            if(flag != 0 && flag != 1){
                do{
                    System.out.println("value is invalid.");
                    System.out.println("retry? Yes=>1\tNo=>0");
                    flag = stdIn.nextInt();
                } while(flag != 0 && flag != 1);
            }

        } while(flag == 1);
    }

}
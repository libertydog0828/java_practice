import java.util.Scanner;

class DayTester{
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("input Day1\n");
        System.out.print("Year : "); int Y = stdIn.nextInt();
        System.out.print("Month : "); int M = stdIn.nextInt();
        System.out.print("Date : "); int D = stdIn.nextInt();

        Day day1 = new Day(Y, M, D);
        System.out.print("make day2\n");
        Day day2 = new Day(day1);

        if(day1.equalTo(day2)){
            System.out.print("day1 is equal day2\n");
        }
        else System.out.print("day1 is not equal day2\n");

        Day d1 = new Day();
        Day d2 = new Day(2017);
        Day d3 = new Day(2017, 10);
        Day d4 = new Day(2017, 10, 15);
        
        System.out.println("d1  =   " + d1);
        System.out.println("d2  =   " + d2);
        System.out.println("d3  =   " + d3);
        System.out.println("d4  =   " + d4);

        Day[] day_array = new Day[3];

        for(int i = 0; i < day_array.length; i++){
            day_array[i] = new Day();
        }

        for(int i = 0; i < day_array.length; i++){
            System.out.println("d[" + i + "]    =   " + day_array[i]);
        }

    }

}
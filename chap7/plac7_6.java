import java.util.Scanner;

class PrintSeason{

    static String Season(int m){
        String season;

        if(m == 3|| m == 4 || m == 5) season = "春";
        else if(m == 6 || m == 7 || m == 8) season = "夏";
        else if(m == 9 || m == 10 || m == 11) season = "秋";
        else season = "冬";

        return season;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int season;
        String season_str;
        System.out.print("input season : ");
        season = stdIn.nextInt();

        if(season < 1 || season > 12){
            do{
                System.out.println("value is valid");
                System.out.print("input season : ");
                season = stdIn.nextInt();
            } while(season < 1 || season > 12);
        }

        season_str = Season(season);
        System.out.printf("%s\n", season_str);
        
    }
}
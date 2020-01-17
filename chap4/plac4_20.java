import java.util.Scanner;

class SeasonReport{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int season;
        int month;
        int flag = 0, subflag = 0;

        do{
            subflag = 0;
            System.out.print("input month : ");
            month = stdIn.nextInt();

            if(month < 1 || month > 12){
                do{
                    System.out.print("input month : ");
                    month = stdIn.nextInt();
                    if(month >= 1 && month <= 12) subflag = 1;
                }while(subflag == 0);
            }

            if(month >= 3 && month <= 5) System.out.println("Spring");
            else if(month >= 6 && month <= 8) System.out.println("Summer");
            else if(month >= 9 && month <= 11) System.out.println("Fall");
            else System.out.println("Winter");

            System.out.println("Continue || Yes:input 0 No:input 1");
        }while(flag == 0);
    }
}
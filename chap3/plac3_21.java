import java.util.Scanner;

class Season{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int season;

        System.out.print("input month : ");
        season = stdIn.nextInt();
        
        switch(season){
            case 3 :
            case 4 :
            case 5 : System.out.print("Spring");
            break;
            case 6 :
            case 7 :
            case 8 : System.out.print("Summer");
            break;
            case 9 :
            case 10 :
            case 11 : System.out.print("Automn");
            break;
            case 12 :
            case 1 :
            case 2 : System.out.print("Winter");
            break;
            default : System.out.print("input value is not effective");
            break;
        }

    }
}
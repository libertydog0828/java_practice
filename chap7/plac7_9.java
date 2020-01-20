import java.util.Scanner;

class InverseNumber{
    static int readPlusInt(){
        Scanner stdIn = new Scanner(System.in);
        int x;

        System.out.print("input number : ");
        return x = stdIn.nextInt();
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        int flag = 0;

        do{
            do{
                n = readPlusInt();
            } while(n <= 0);

            ///////////////
            ////reverse////
            ///////////////

            System.out.println("Yes => 1\tNo => 0");
            flag = stdIn.nextInt();
            if(flag != 0 && flag != 1){
                do{
                    flag = stdIn.nextInt();
                } while(flag != 0 && flag != 1);
            }
        } while(flag == 0);
        
    }

}
import java.util.Scanner;

class PutAsteriskAlt1{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("input number : ");
        int num = stdIn.nextInt();

        int i;

        for(i = 0; i < num; i++){
            if(i%2 == 0)System.out.print("*");
            else System.out.print("+");
        }

    }

}
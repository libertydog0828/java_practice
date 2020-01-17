import java.util.Scanner;

class CountDown{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("input count : ");
        int Count = stdIn.nextInt();

        if(Count <= 0) System.out.print("value is not effective");

        do{
            System.out.print(Count + " ");
            Count--;
        } while(Count >= 0);

    }

}
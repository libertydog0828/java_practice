import java.util.Scanner;

class SumUpForExp{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int oldsum = 0, newsum = 0;
        int n, i;

        System.out.print("input n : ");
        n = stdIn.nextInt();

        i = 0;

        do{
            newsum = oldsum + i;
            System.out.println(n + " " + newsum + " = " +  oldsum + " + " + i);
            i++;
            oldsum = newsum;
        }while(n >= i);

        System.out.print("sum = " + newsum);

    }
}
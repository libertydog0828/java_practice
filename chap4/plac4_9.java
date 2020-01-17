import java.util.Scanner;

class DigitNo{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = 0;

        System.out.print("input value : ");
        int num = stdIn.nextInt();

        if(num < 0){
            System.out.print("正の値を入力してください.");
            System.exit(0);
        }

        do{
            count++;
            num /= 10;
        } while(num > 0);

        System.out.print("入力した値は " + count + " 桁です.");
    }
}
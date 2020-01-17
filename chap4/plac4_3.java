import java.util.Scanner;
import java.util.Random;

class Kazuate2Digits{
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int Num;
        int Ans;

        Ans = 10 + rand.nextInt(90); //10 ~ 99//

        System.out.print("数あてゲーム開始!!\n10 ~ 99の数を当ててください\n");
        System.out.print("いくつかな : ");

        do{
            Num = stdIn.nextInt();

            if(Num < Ans) System.out.print("もっと大きな数字だよ\n");
            else if(Num > Ans) System.out.print("もっと小さな数字だよ\n");
            else System.out.print("正解!!\n答えは " + Num);
        } while(Num != Ans);

    }
}
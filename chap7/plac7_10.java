/*
x + y + z
x + y - z
x - y + z
z - y - z
*/
import java.util.Scanner;
import java.util.Random;

class MentalArthmetical{

    static Scanner stdIn = new Scanner(System.in);
    static Random rand = new Random();

    static int putProblem(int x, int y, int z, int p_num){
        int ans = 0;
        if(p_num == 1){
            System.out.printf("%d + %d + %d = ", x, y, z);
            ans = x + y + z;
        }

        else if(p_num == 2){
            System.out.printf("%d + %d - %d = ", x, y, z);
            ans = x + y - z;
        }

        else if(p_num == 3){
            System.out.printf("%d - %d + %d = ", x, y, z);
            ans = x - y + z;
        }

        else{
            System.out.printf("%d - %d - %d = ", x, y, z);
            ans = x - y - z;
        }

        return ans;
    }

    static int loopJudge(){
        int f = -1;
        
        while(f != 0 && f != 1){
            System.out.print("Retry?...Yes => 1\tNo => 0\n");
            f = stdIn.nextInt();
        }

        return f;
    }

    static int inputNum(){
        int x;
        x = 100 + rand.nextInt(900);
        return x;
    }

    public static void main(String[] args){

        int x, y, z;
        int your_ans;
        int ans;
        int flag = -1;
        int program_num = -1;

        System.out.println("Answer the problem");

        do{
            x = inputNum();
            y = inputNum();
            z = inputNum();

            program_num = 1 + rand.nextInt(4);
            ans = putProblem(x, y, z, program_num);
            your_ans = stdIn.nextInt();

            if(your_ans == ans) System.out.println("Correct!!");
            else System.out.println("Incorrect");

            flag = loopJudge();

        }while(flag == 1);

    }
}
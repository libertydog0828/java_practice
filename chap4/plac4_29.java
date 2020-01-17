import java.util.Scanner;

class SumGroup2 {
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        System.out.println("Adding integer number.");
        int total = 0;
        int num;

        Outer:
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " Group");
            
            for(int j = 0; j < 5; j++){
                System.out.print("input...");
                num = stdIn.nextInt();

                if(num == 99999){
                    break Outer;
                }
                else if(num == 88888){
                    continue Outer;
                }

                total += num;
            }
        }

        System.out.println("Total = " + total);
    }
}
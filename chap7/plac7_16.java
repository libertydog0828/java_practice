import java.util.Scanner;

class MinOfHeightWeight{
    
    static Scanner stdIn = new Scanner(System.in);

    static void InputArray(int[][] x){
        for(int i = 0; i < x.length; i++){
            System.out.printf("%d height : ", i + 1);
            x[i][0] = stdIn.nextInt();
            System.out.printf("%d weight : ", i + 1);
            x[i][1] = stdIn.nextInt();
        }
    }

    static void MinArray(int[][] x, int[] min){
        min[0] = x[0][0];
        min[1] = x[0][1];

        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                if(min[j] > x[i][j]) min[j] = x[i][j];
            }
        }
    }

    public static void main(String[] args){
        int n;
        System.out.print("How many students : ");
        n = stdIn.nextInt();

        int[][] datas = new int[n][2];
        int[] min = new int[2];

        InputArray(datas);

        MinArray(datas, min);

        System.out.println("minimum Height : " + min[0]);
        System.out.println("minimum Weight : " + min[1]);

    }
}
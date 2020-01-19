import java.util.Scanner;

class UnevennessArray {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int ROW;

        System.out.print("input the number of row : ");
        ROW = stdIn.nextInt();

        int[][] c = new int[ROW][];
        int[] COLUMN = new int[ROW];

        for(int i = 0; i < ROW; i++){
            System.out.printf("Column of %d : ", i);
            COLUMN[i] = stdIn.nextInt();
            c[i] = new int[COLUMN[i]];
        }

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.printf("c[%d][%d] : ", i, j);
                c[i][j] = stdIn.nextInt();
            }
        }

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMN[i]; j++){
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println("");
        }

    }
}
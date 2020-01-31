import java.util.Scanner;

class MatrixAdd{
    static Scanner stdIn = new Scanner(System.in);

    static void InputMat(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.printf("[%d][%d] : ", i, j);
                mat[i][j] = stdIn.nextInt();
            }
        }
    }

    static void AddMat(int[][] x, int[][] y, int[][] z){
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                z[i][j] = x[i][j] + y[i][j];
            }
        }
    }

    public static void main(String[] args){
        int line;
        int column;
        int[][] a, b, c;

        System.out.print("Input Line : ");
        line = stdIn.nextInt();
        System.out.print("Input Column : ");
        column = stdIn.nextInt();

        a = new int[line][column];
        b = new int[line][column];
        c = new int[line][column];

        System.out.print("Input matrix a \n");
        InputMat(a);
        System.out.print("Input matrix b \n");
        InputMat(b);

        System.out.print("total mat c : \n");
        AddMat(a, b, c);
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++) {
                System.out.printf("[%d][%d] : %d\t", i, j, c[i][j]);
            }
            System.out.println("");
        }

    }

}
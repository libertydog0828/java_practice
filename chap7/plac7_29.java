import java.util.Scanner;

class AryClone{

    static Scanner stdIn = new Scanner(System.in);

    static void InputMat(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.printf("[%d][%d] : ", i, j);
                mat[i][j] = stdIn.nextInt();
            }
        }
    }

    static int[][] Clone(int[][] mat){
        int[][] ret_mat;
        ret_mat = new int[mat.length][];
        for(int i = 0; i < mat.length; i++) ret_mat[i] = new int[mat[i].length];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                ret_mat[i][j] = mat[i][j];
            }
        }
        return ret_mat;
    }

    static void PrintMat(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++) {
                System.out.printf("[%d][%d] : %d\t", i, j, mat[i][j]);
            }
            System.out.println("");
        }
       
    }

    public static void main(String[] args){
        int line;
        int column;
        int[][] a, b;
        
        do{
            System.out.print("line : ");
            line = stdIn.nextInt();
            System.out.print("column : ");
            column = stdIn.nextInt();
        } while(line <= 0||column <= 0);

        a = new int[line][column];
        InputMat(a);

        b = Clone(a);

        System.out.println("Matrix A\n______________\n");
        PrintMat(a);
        System.out.println("Matrix B\n______________\n");
        PrintMat(b);

    }

}
import java.util.Scanner;

class MatrixAdd{

    static Scanner stdIn = new Scanner(System.in);

    static boolean AddMat(int[][] a, int[][] b, int[][] c){
        int count_a = 0, count_b = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                count_a++;
            }
        }

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                count_b++;
            }
        }

        if(count_a == count_b){
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            return true;
        }

        else return false;
    }

    static void PrintMat(int[][] x){
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.printf("[%d][%d] : %d\t", i, j, x[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args){
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        int[][] y = {{7, 8, 9}, {10, 11, 12}};
        int[][] z = new int[2][3];

        if(AddMat(x, y, z)){
            System.out.println("x matrix");
            PrintMat(x);
            System.out.println("y matrix");
            PrintMat(y);
            System.out.println("Total Mat");
            PrintMat(z);
        }
        else System.out.printf("The number of Elements is not match\n");

    }
}
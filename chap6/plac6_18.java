import java.util.Scanner;

class MatrixProduct{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
	
        int[][] A = new int[4][3];
        int[][] B = new int[3][4];
        int[][] C = new int[4][4];

        System.out.println("input A matrix");
	    for(int i = 0; i < 4; i++){
	        for(int j = 0; j < 3; j++){
                System.out.printf("A[%d][%d] : ", i, j);
                A[i][j] = stdIn.nextInt();
	        }
        }

        System.out.println("input B matrix");
	    for(int i = 0; i < 3; i++){
	        for(int j = 0; j < 4; j++){
                System.out.printf("B[%d][%d] : ", i, j);
                B[i][j] = stdIn.nextInt();
	        }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 3; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("[%d][%d] %d ", i, j, C[i][j]);
            }
            System.out.println("");
        }

    }
}

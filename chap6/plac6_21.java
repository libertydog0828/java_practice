import java.util.Scanner;

class PointClass{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int classNum;
        int stuNum;
        int sum = 0;
        double ave_sum = 0.0;

        System.out.print("input the number of class : ");
        classNum = stdIn.nextInt();

        int[][] score = new int[classNum][];
        int[] total = new int[classNum];
        double[] average = new double[classNum];

        for(int i = 0; i < score.length; i++){
            System.out.print("The number of student : ");
            stuNum = stdIn.nextInt();
            score[i] = new int[stuNum];
            for(int j = 0; j < score[i].length; j++){
                System.out.printf("class[%d] No.%d score : ", i + 1, j + 1);
                score[i][j] = stdIn.nextInt();
                total[i] += score[i][j];
            }
            average[i] = total[i]/(double)stuNum;
            ave_sum += average[i];
            sum += total[i];
        }

        System.out.print("class\ttotal\taverage\n");

        for(int i = 0; i < classNum; i++){
            System.out.printf("%d\t%d\t%f\n", i + 1, total[i], average[i]);
        }

        System.out.printf("ALL\t%d\t%f\n", sum, ave_sum/(double)classNum);

    }
}
import java.util.Scanner;

class PointTotalization {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int[][] score = new int[6][2];
        int[] score_total = new int[2];
        int[] student_total = new int[6];

        System.out.print("input score of Japanese/Math\n");

        for(int i = 0; i < 6; i++){
            System.out.print("No." + (i + 1));

            System.out.print("\tJapanese : ");
            score[i][0] = stdIn.nextInt();
            System.out.print("    \tMath : ");
            score[i][1] = stdIn.nextInt();

            score_total[0] += score[i][0];
            score_total[1] += score[i][1];

            student_total[i] = score[i][0] + score[i][1];
        }

        System.out.printf("Average Japanese : %f\tAverage Math : %f\n", score_total[0]/6.0, score_total[1]/6.0);
        
        for(int i = 0; i < 6; i++){
            System.out.printf("Average No.%d : %f\n", i + 1, student_total[i]/2.0);
        }

    }
}
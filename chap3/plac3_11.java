import java.util.Scanner;

class Grade1{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int Score;
        String Grade = "";

        System.out.print("Score : ");
        Score = stdIn.nextInt();

        if(Score >= 0 && Score <= 59) Grade = "不可";
        else if(Score >= 60 && Score <= 69) Grade = "可";
        else if(Score >= 70 && Score <= 79) Grade = "良";
        else if(Score >= 80 && Score <= 100) Grade = "優";
        else {
            System.out.print(Score + " is not effective.");
            System.exit(0);
        }
        System.out.print("あなたの成績は" + Grade + " です.");
    }

}
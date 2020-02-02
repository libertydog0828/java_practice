import java.util.Scanner;

class HumanTester{

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        int ClassNo, No;

        do{
            System.out.print("How many people : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        Human[] p = new Human[n];
        for(int i = 0; i < p.length; i++){
            System.out.printf("No.%d\n", i + 1);
            System.out.print("name : "); String name = stdIn.next();
            System.out.print("height : "); int height = stdIn.nextInt();
            System.out.print("weight : "); int weight = stdIn.nextInt();
            p[i] = new Human(name, height, weight);
        }

        do{
            System.out.print("input ClassNo : ");
            ClassNo = stdIn.nextInt();
        }while(ClassNo <= 0);

        do{
            System.out.print("input Attendance No : ");
            No = stdIn.nextInt();
        }while(No <= 0);
        
        Human[][] q = new Human[ClassNo][No];

        for(int i = 0; i < q.length; i++){
            System.out.printf("%d Class information\n", i + 1);
            for(int j = 0; j < q[i].length; j++){
                System.out.printf("No. %d\n", j + 1);
                System.out.print("name : "); String name = stdIn.next();
                System.out.print("height : "); int height = stdIn.nextInt();
                System.out.print("weight : "); int weight = stdIn.nextInt();
                q[i][j] = new Human(name, height, weight);
            }
        }

        System.out.print("\n___________________________________\n");

        for(int i = 0; i < p.length; i++){
            System.out.println("No. " + (i + 1) + " "+ p[i]);
        }

        System.out.println();

        for(int i = 0; i < q.length; i++){
            System.out.printf("%d Class information\n", i + 1);
            for(int j = 0; j < q[i].length; j++){
                System.out.print("No. " + (j + 1) + " " + q[i][j]);
            }
            System.out.println();
        }

    }
}
import java.util.Scanner;

class HeightWeight{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int Height1, Height2;
        int diff;
        int temp;
        double Weight;

        System.out.print("input Height1 : ");
        Height1 = stdIn.nextInt();

        System.out.printf("input Height2 : ");
        Height2 = stdIn.nextInt();

        System.out.print("input diff : ");
        diff = stdIn.nextInt();

        if(Height1 > Height2){
            temp = Height2;
            Height2 = Height1;
            Height1 = temp;
        }

        do{
            System.out.println("Height : " + Height1 + " Standerd_Weight = " + (Height1 - 100.0)*0.9);
            Height1 += diff;
        }while(Height2 >= Height1);

    }
}
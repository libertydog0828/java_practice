import java.util.Scanner;

class EnumScope {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int A, B;
        int temp, diff;
        int i;

        System.out.print("input A : ");
        A = stdIn.nextInt();

        System.out.print("input B : ");
        B = stdIn.nextInt();

        if(A < B){
            temp = A;
            A = B;
            B = temp;
        }

        diff = A - B;

        for(i = 1; i < diff; i++){
            System.out.println(B + i);
        }

    }

}
import java.util.Scanner;

class Modulo3{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;
        int mod;

        System.out.print("input : ");
        x = stdIn.nextInt();

        mod = x%3;

        if(x > 0){
            if(mod == 0) System.out.print(x + " is modulo 0.");
            else if(mod == 1) System.out.print(x + " is modulo 1.");
            else System.out.print(x + " is modulo 2.");
        }
        else System.out.print(x + " is not positive");
    }
}
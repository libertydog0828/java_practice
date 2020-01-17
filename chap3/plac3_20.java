import java.util.Random;

class FingerFlashing{
    public static void main(String[] args) {
        Random rand = new Random();
        int finger = rand.nextInt(3);

        System.out.print("乱数を生成\n");

        if(finger == 0) System.out.print("グー");
        else if(finger == 1) System.out.print("チョキ");
        else System.out.print("パー");

    }
}
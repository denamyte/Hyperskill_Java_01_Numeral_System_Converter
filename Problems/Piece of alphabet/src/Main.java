import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] codes  = new Scanner(System.in).nextLine().codePoints().toArray();
        for (int i = 1; i < codes.length; i++) {
            if (codes[i] - codes[i - 1] != 1) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
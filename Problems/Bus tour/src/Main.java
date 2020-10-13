import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int brNum = scanner.nextInt();
        String message = "Will not crash";
        for (int i = 1; i <= brNum; i++) {
            if (scanner.nextInt() <= height) {
                message = "Will crash on bridge " + i;
                break;
            }
        }
        System.out.println(message);
    }
}
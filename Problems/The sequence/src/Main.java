import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n;
        int maxDiv = 0;
        while (size-- > 0) {
            n = scanner.nextInt();
            if (n > maxDiv && n % 4 == 0) {
                maxDiv = n;
            }
        }
        System.out.println(maxDiv);
    }
}
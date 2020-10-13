import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        final int b = scanner.nextInt();
        for (int i = (int) (a + 1); i < b; i++) {
            a *= i;
        }
        System.out.println(a);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(solve(a, b, n));
    }

    static int solve(int a, int b, int n) {
//        return 1 + (int) (b - (Math.ceil((double) a / n) * n)) / n;
        return b / n - (a - 1) / n;
    }
}
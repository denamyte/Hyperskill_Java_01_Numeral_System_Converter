import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(test(n) ? "True" : "False");
    }

    static boolean test(int n) {
        return    -15 < n && n <= 12
                || 14 < n && n < 17
                || 19 <= n;
    }
}
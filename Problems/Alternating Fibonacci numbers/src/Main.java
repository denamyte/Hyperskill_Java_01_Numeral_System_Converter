import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        int sign = n % 2 == 0 ? -1 : 1;
        return sign * fibRec(n);
    }

    private static long fibRec(long n) {
        return n >= 2
                ? fibRec(n - 2) + fibRec(n - 1)
                : n;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
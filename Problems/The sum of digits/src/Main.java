import java.util.Scanner;

class Main {
    public static final int START_DIVIDER = 1_000_000_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumOfAnyIntDigits(scanner.nextInt()));
    }

    public static int sumOfAnyIntDigits(int n) {
        int remainder = n;
        int divider = START_DIVIDER;
        int sum = 0;
        while (divider > 0) {
            sum += remainder / divider;
            remainder %= divider;
            divider /= 10;
        }
        return sum;
    }
}


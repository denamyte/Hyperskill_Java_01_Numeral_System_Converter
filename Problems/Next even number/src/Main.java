import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(nextEven(validate(scanner.nextInt())));
    }

    public static int validate(int value) {
        if (value <= 0 || value > 10_000) {
            throw new IllegalArgumentException("value must be in the range (0 .. 10_000]");
        }
        return value;
    }

    public static int nextEven(int value) {
        int next = value;
        do {
            next++;
        } while (next % 2 != 0);
        return next;
    }
}
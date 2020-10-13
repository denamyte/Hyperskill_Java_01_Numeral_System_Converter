import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = validate(scanner.nextInt());
        int k = validate(scanner.nextInt());
        System.out.println(k / n);
    }

    public static int validate(int value) {
        if (value <= 0 || value > 10_000) {
            throw new IllegalArgumentException("value must be in the range (0 .. 10_000]");
        }
        return value;
    }
}
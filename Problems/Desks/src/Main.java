import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        final double divider = 2;
        for (int i = 0; i < 3; i++) {
            sum += Math.ceil(validate(scanner.nextInt()) / divider);
        }
        System.out.println(sum);
    }

    public static int validate(int value) {
        if (value < 0 || value > 1_000) {
            throw new IllegalArgumentException("value is out of range");
        }
        return value;
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = validate(scanner.nextInt());
        System.out.println(n % 100 / 10);
    }

    public static int validate(int value) {
        if (value < 0 || value > 1_000_000) {
            throw new IllegalArgumentException("value is out of range");
        }
        return value;
    }
}
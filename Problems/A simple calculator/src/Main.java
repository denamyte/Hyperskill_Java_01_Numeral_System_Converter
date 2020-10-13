import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLong(), scanner.next(), scanner.nextLong()));
    }

    private static String calc(long a, String op, long b) {
        switch (op) {
            case "+": return a + b + "";
            case "-": return a - b + "";
            case "/": return b == 0 ? "Division by 0!" : a / b + "";
            case "*": return a * b + "";
            default: return  "Unknown operator";
        }
    }
}
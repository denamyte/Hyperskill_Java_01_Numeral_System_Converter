import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solve(scanner.nextInt(), scanner.nextInt(), 3));
    }

    /** calculates the arithmetic average of the numbers divisible by the specified divider on the interval [lo, hi]. */
    static double solve(double lo, double hi, int div) {
        double start = Math.ceil(lo / div) * div;
        double end = Math.floor(hi / div) * div;
        return (start + end) / 2;
    }
}
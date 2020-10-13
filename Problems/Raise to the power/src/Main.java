import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    // Stream, just for fun, part 2
    public static long power(int n, int m) {
        return LongStream.range(0, m).map(i -> n).reduce(1, (l, l1) -> l * l1);
//        return m > 0
//                ? n * power(n, m - 1)
//                : 1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}
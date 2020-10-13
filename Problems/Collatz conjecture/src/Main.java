import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        IntStream.iterate(
            new Scanner(System.in).nextInt(),
            n -> n > 1,
            n -> (n % 2 == 0)
                    ? n / 2
                    : n * 3 + 1)
            .forEach(n -> System.out.printf("%d ", n));
        System.out.println(1);
    }
}
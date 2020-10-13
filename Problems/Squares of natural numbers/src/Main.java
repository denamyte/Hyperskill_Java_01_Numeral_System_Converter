import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        IntStream.iterate(1, i -> i + 1)
                .map(i -> i * i)
                .takeWhile(i -> i <= n)
                .forEach(System.out::println);
    }
}
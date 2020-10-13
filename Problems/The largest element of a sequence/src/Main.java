import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                IntStream.iterate(Integer.MIN_VALUE, i -> i != 0, i -> scanner.nextInt())
                        .reduce(Math::max).orElseThrow());
    }
}
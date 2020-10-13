import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        IntStream.generate(new Iterator()::next)
            .limit(new Scanner(System.in).nextInt())
            .forEach(i -> System.out.printf("%d ", i));
    }

    static class Iterator { // should be named StrangeIterator
        int iteration = 0;
        int num = 0;
        int next() {
            if (iteration < num) {
                iteration++;
                return num;
            } else {
                iteration = 1;
                return ++num;
            }
        }
    }
}
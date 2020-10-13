import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = IntStream.generate(scanner::nextInt).limit(6).toArray();
        System.out.println(
                (data[3] - data[0]) * 60 * 60 +
                (data[4] - data[1]) * 60 +
                data[5] - data[2]);
    }
}
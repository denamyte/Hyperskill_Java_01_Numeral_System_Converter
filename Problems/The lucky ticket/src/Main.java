import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(sum(s, 0, 3) == sum(s, 3, 6) ? "Lucky" : "Regular");
    }

    private static int sum(String s, int from, int to) {
        return IntStream.range(from, to).map(s::charAt).sum();
    }
}
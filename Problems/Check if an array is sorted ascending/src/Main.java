import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = IntStream.generate(scanner::nextInt).limit(scanner.nextInt()).toArray();
        System.out.println(isAsc(data));
    }

    static boolean isAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] - (arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Arrays.stream(inputAndSolve()).forEach(i -> System.out.printf("%d ", i));
    }

    static int[] inputAndSolve() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] result = new int[4];
        for (int i = 0; i < size; i++) {
            result[scanner.nextInt() - 2]++;
        }
        return result;
    }
}
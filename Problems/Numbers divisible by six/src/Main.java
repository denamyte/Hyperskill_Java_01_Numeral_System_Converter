import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int[] data = input();
        System.out.println(solve(data));
    }

    static int solve(int[] data) {
        return Arrays.stream(data).filter(Main::sixDiv).sum();
    }

    static boolean sixDiv(int n) {
        return n % 6 == 0;
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        return data;
    }
}
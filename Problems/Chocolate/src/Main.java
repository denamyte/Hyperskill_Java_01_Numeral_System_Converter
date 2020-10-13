import java.util.Scanner;

class Main {
    static final int N = 0, M = 1, K = 2;

    public static void main(String[] args) {
        final int[] data = input(3);
        System.out.println(test(data) ? "YES" : "NO");
    }

    static boolean test(int[] data) {
        return data[K] <= data[N] * data[M] &&
                (data[K] % data[N] == 0 || data[K] % data[M] == 0);
    }

    static int[] input(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        return data;
    }
}
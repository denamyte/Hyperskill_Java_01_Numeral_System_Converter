import java.util.Scanner;

class Main {
    static final int X1 = 0, Y1 = 1, X2 = 2, Y2 = 3;

    public static void main(String[] args) {
        final int[] data = input(4);
        System.out.println(test(data) ? "YES" : "NO");

    }

    static int[] input(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        return data;
    }

    static boolean test(int[] data) {
        return data[X1] == data[X2] || data[Y1] == data[Y2]
                || Math.abs(data[X1] - data[X2]) == Math.abs(data[Y1] - data[Y2]);
    }

}
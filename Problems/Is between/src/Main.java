import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int[] data = input(3);
        System.out.println(
                between(data[0], data[1], data[2]) || between(data[0], data[2], data[1]));
    }

    static int[] input(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        return data;
    }

    static boolean between(int i, int lo, int hi) {
        return lo <= i && i <= hi;
    }
}
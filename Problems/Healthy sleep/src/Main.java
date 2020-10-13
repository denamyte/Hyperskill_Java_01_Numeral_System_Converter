import java.util.Scanner;

class Main {
    static final int A = 0, B = 1, H = 2;
    public static void main(String[] args) {
        final int[] data = input(3);
        System.out.println(stringifyRange(data));
    }

    static String stringifyRange(int[] data) {
        if (data[H] < data[A]) {
            return "Deficiency";
        } else if (data[H] > data[B]) {
            return "Excess";
        }
        return "Normal";
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
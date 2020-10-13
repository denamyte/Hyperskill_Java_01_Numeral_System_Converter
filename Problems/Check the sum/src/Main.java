import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] data = input(3);
        System.out.println(
                conform(data[0], data[1]) || conform(data[0], data[2]) || conform(data[1], data[2]));
    }

    static int[] input(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        return data;
    }

    static boolean conform(int i, int j) {
        return i + j == 20;
    }

}
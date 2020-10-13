import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] data = input(3);
        System.out.println(Arrays.stream(data).filter(i -> i > 0).count() == 1);
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
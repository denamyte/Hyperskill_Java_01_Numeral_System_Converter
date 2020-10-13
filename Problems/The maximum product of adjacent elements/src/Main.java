import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] data = new int[size];
        data[0] = scanner.nextInt();
        for (int i = 1; i < size; i++) {
            data[i] = scanner.nextInt();
            data[i - 1] *= data[i];
        }
        System.out.println(Arrays.stream(data).limit(size - 1).max().orElseThrow());
    }
}
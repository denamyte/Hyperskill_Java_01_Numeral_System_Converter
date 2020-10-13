import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        boolean farAway = true;
        for (int i = 1; i < size; i++) {
            if (data[i - 1] == m && data[i] == n
                || data[i - 1] == n && data[i] == m) {
                farAway = false;
                break;
            }
        }
        System.out.println(farAway);
    }
}
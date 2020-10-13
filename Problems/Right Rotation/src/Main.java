import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" +");
        int length = data.length;
        int rotate = scanner.nextInt() % length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%s ", data[(length + i - rotate) % length]);
        }
    }
}
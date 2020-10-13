import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < size; i++) {
            int next = scanner.nextInt();
            if (next > max) {
                max = next;
                index = i;
            }
        }
        System.out.println(index);
    }
}
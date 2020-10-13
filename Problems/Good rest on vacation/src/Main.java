import java.util.Scanner;

class Main {
    static final int DAYS = 0, FOOD = 1, FLIGHT = 2, NIGHT = 3;

    public static void main(String[] args) {
        final int[] data = input(4);
        System.out.println(calculate(data));
    }

    static int[] input(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        return data;
    }

    static int calculate(int[] data) {
        return data[FOOD] * data[DAYS] + // food cost
                data[FLIGHT] * 2 + // flight cost
                data[NIGHT] * (data[DAYS] - 1); // hotel cost
    }
}
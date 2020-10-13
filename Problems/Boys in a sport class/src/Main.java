import java.util.Scanner;

class Main {
    // I'm trying to write formalized solutions,
    public static void main(String[] args) {
        int[] data = input(3);
        System.out.println(test(data));
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
        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < data.length - 1; i++) {
            int compare = Integer.compare(data[i], data[i + 1]);
            if (compare < 0) {
                if (desc) {
                    return false;
                }
                asc = true;
            } else if (compare > 0) {
                if (asc) {
                    return false;
                }
                desc = true;
            }
        }
        return true;
    }
}
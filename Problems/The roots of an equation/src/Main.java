import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Main {
    static final int A = 0, B = 1, C = 2, D = 3;
    static final int LO = 0, HI = 1000;

    public static void main(String[] args) {
        final int[] data = input(4);
        final Collection<Integer> roots = solve(data);
        roots.forEach(System.out::println);
    }

    static Collection<Integer> solve(int[] data) {
        Collection<Integer> roots = new ArrayList<>(3);
        int i = LO;
        while (roots.size() < 3 && i <= HI) {
            if (data[A] * i * i * i + data[B] * i * i + data[C] * i + data[D] == 0) {
                roots.add(i);
            }
            i++;
        }
        return roots;
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
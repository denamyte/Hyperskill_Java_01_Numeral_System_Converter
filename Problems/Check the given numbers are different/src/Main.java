import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    static final int COUNT = 3;

    public static void main(String[] args) {
        Set<Integer> data = input(COUNT);
        System.out.println(data.size() == COUNT);
    }

    static Set<Integer> input(int size) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(scanner.nextInt());
        }
        return set;
    }
}
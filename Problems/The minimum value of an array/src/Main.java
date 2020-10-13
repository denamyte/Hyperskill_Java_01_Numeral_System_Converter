import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Skipping...
        System.out.println(Arrays.stream(scanner.nextLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .reduce(Integer.MAX_VALUE, Math::min));
    }
}
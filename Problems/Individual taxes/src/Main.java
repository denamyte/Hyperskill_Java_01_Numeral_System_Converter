import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Skipping...
        int[] incomes = getIntArray(scanner);
        int[] percents = getIntArray(scanner);
        int max = 0, index = 0, prod;
        for (int i = 0; i < incomes.length; i++) {
            if ((prod = incomes[i] * percents[i]) > max) {
                max = prod;
                index = i;
            }
        }
        System.out.println(index + 1);
    }

    private static int[] getIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();
    }
}
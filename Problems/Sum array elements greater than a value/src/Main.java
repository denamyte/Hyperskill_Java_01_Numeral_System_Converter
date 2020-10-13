import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // the size is useless information here, skipping
        final String nums = scanner.nextLine();
        final int lo = scanner.nextInt();
        System.out.println(
            Arrays.stream(nums.split(" "))
                .map(Integer::parseInt)
                .filter(i -> i > lo)
                .reduce(0, Integer::sum));
    }
}
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // skipping
        final Stream<String> stream = Arrays.stream(scanner.nextLine().split(" "));
        String third = scanner.next();
        System.out.println(stream.filter(s -> s.equals(third)).count());
    }
}
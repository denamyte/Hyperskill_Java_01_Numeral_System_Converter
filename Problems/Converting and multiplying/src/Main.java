import java.util.Scanner;
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        new Scanner(System.in)
                .tokens()
                .takeWhile(Predicate.not("0"::equals))
                .map(s -> {
                    try {
                        return 10 * Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        return "Invalid user input: " + s;
                    }
                })
                .forEach(System.out::println);
    }
}
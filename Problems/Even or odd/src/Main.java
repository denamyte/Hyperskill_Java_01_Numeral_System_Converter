import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        new Scanner(System.in).tokens()
            .map(Integer::parseInt)
            .takeWhile(i -> i != 0)
            .map(i -> i % 2 == 0 ? "even" : "odd")
            .forEach(System.out::println);
    }
}
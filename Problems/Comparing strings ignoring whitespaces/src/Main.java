import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        System.out.println(
            Stream.generate(new Scanner(System.in)::nextLine).limit(2)
                .map(s -> s.replace(" ", ""))
                .collect(Collectors.toSet()).size() == 1);
    }
}
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Stream.generate(scanner::next).limit(scanner.nextInt()).collect(Collectors.toList());
        list.add(0, list.remove(list.size() - 1));
        System.out.println(String.join(" ", list));

    }
}
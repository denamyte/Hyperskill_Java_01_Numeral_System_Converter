import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Arrays.stream(new Scanner(System.in).nextLine().split(""))
                .forEach(s -> System.out.printf("%s%s", s, s));
    }
}
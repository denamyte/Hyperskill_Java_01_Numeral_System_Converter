import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String found = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .reduce("", (s, s2) -> s2.length() > s.length() ? s2 : s);
        System.out.println(found);
    }
}
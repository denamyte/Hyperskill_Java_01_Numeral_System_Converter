import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        new Scanner(System.in)
            .nextLine()
            .chars()
            .mapToObj(i -> (char) (i == 'a' ? 'b' : i))
            .forEach(System.out::print);
    }
}
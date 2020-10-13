import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] prev = {""};
        boolean[] res = {true};
        new Scanner(System.in).tokens()
            .takeWhile(s -> res[0] = prev[0].compareTo(prev[0] = s) <= 0).count();
        System.out.println(res[0]);
    }
}
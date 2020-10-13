import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        long count = s.codePoints().filter(i -> i == 'c' || i == 'g').count();
        System.out.println(100d * count / s.length());
    }
}
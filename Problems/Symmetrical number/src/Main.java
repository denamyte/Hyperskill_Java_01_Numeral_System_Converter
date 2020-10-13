import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(test(n + "") ? 1 : -1);
    }

    static boolean test(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
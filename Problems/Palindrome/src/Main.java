import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(s.equals(new StringBuilder(s).reverse().toString())
                                   ? "yes" : "no");
    }
}
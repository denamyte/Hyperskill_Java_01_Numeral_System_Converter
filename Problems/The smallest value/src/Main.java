import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long m = new Scanner(System.in).nextLong();
        long prod = 1;
        int i = 1;
        while (prod <= m) {
            prod *= ++i;
        }
        System.out.println(i);
    }
}
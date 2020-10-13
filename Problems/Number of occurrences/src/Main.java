import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sub = scanner.nextLine();
        System.out.println((s.length() - s.replace(sub, "").length()) / sub.length());
    }
}
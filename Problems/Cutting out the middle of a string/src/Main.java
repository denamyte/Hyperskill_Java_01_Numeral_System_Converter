import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int half = (s.length() - 1) / 2;
        System.out.println(s.substring(0, half) + s.substring(s.length() - half));
    }
}
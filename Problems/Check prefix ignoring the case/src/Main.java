import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(s.substring(0, 1).equalsIgnoreCase("j"));
    }
}
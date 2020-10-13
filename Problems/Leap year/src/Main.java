import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        System.out.println(
                (year % 4 == 0 && year % 100 > 0) || year % 400 == 0
                        ? "Leap"
                        : "Regular"
        );
    }
}
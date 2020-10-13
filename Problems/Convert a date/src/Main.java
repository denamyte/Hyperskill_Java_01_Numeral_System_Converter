import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] data = new Scanner(System.in).nextLine().split("-");
        System.out.printf("%s/%s/%s\n", data[1], data[2], data[0]);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int next;
        do {
            next = scanner.nextInt();
            sum += next;
        } while (next != 0 && sum < 1000);
        System.out.println(sum >= 1000 ? sum - 1000 : sum);
    }
}
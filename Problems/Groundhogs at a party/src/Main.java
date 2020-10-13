import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupCount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isSuccessful = isWeekend
                ? 15 <= cupCount && cupCount <= 25
                : 10 <= cupCount && cupCount <= 20;
        System.out.println(isSuccessful);
    }
}
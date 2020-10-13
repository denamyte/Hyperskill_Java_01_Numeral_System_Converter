import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        for (int i = 0; i < 3; i++) {
            scanner.next();
        }
        String cuisinePref = scanner.next();
        System.out.printf("The form for %s is completed. We will contact you if we need a chef " +
                                  "that cooks %s dishes.%n", firstName, cuisinePref);
    }
}
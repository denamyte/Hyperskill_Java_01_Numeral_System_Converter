import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asc = false;
        boolean desc = false;
        int prev;
        int next = scanner.nextInt();
        do {
            prev = next;
            if ((next = scanner.nextInt()) == 0) {
                break;
            }
            if (prev < next) {
                asc = true;
            } else if (prev > next) {
                desc = true;
            }
        } while (ordered(asc, desc));
        System.out.println(ordered(asc, desc));
    }

    private static boolean ordered(boolean asc, boolean desc) {
        return !asc && !desc || asc ^ desc;
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (; size-- > 0;) {  // A piece of while style in a for loop :)
            // The IDE wants to replace it with while, but the task tells to use for
            final int next = scanner.nextInt();
            if (next > max && next % 4 == 0) {
                max = next;
            }
        }
        System.out.println(max);
    }
}
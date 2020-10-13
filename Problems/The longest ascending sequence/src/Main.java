import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int curSeq = 0;
        int longestSeq = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int next = scanner.nextInt();
            if (next > prev) {
                curSeq++;
            } else {
                longestSeq = Math.max(longestSeq, curSeq);
                curSeq = 1;
            }
            prev = next;
        }
        System.out.println(Math.max(longestSeq, curSeq));
    }
}
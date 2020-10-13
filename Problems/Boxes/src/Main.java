import java.util.Scanner;

public class Main {

    static String[] results = {"Box 1 > Box 2", "Box 1 < Box 2", "Incompatible"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] boxes = {getArray(scanner), getArray(scanner)};
        int gtInd = volume(boxes[0]) > volume(boxes[1]) ? 0 : 1;

        System.out.println(results[match(boxes[gtInd], boxes[gtInd ^ 1]) ? gtInd : 2]);
    }

    private static int[] getArray(Scanner scanner) {
        return scanner.tokens().limit(3).mapToInt(Integer::parseInt).sorted().toArray();
    }

    private static long volume(int[] box) {
        return box[0] * box[1] * box[2];
    }

    private static boolean match(int[] b1, int[] b2) {
        return b1[0] > b2[0] && b1[1] > b2[1] && b1[2] > b2[2];
    }
}
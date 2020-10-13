import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        inputAndSolve().values().forEach(i -> System.out.printf("%d ", i));
    }

    static Map<Integer, Integer> inputAndSolve() {
        Scanner scanner = new Scanner(System.in);
        final Map<Integer, Integer> totals = generateTotals();
        IntStream.generate(scanner::nextInt)
                .limit(scanner.nextInt())
                .forEach(i -> totals.computeIfPresent(i, (key, old) -> old + 1));
        return totals;
    }

    private static Map<Integer, Integer> generateTotals() {
        final Map<Integer, Integer> totals = new LinkedHashMap<>(3);
        totals.put(0, 0);
        totals.put(1, 0);
        totals.put(-1, 0);
        return totals;
    }
}
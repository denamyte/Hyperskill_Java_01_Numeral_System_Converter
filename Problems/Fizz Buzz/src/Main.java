import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

class Main {

    static final int
            DIV_3 = 0b01,
            DIV_5 = 0b10;

    static Map<Integer, String> resMap = new HashMap<>();
    static List<Function<Integer, Integer>> tests = new ArrayList<>();
    static {
        resMap.put(DIV_3, "Fizz");
        resMap.put(DIV_5, "Buzz");
        resMap.put(DIV_3 | DIV_5, "FizzBuzz");

        tests.add(n -> n % 3 == 0 ? DIV_3 : 0);
        tests.add(n -> n % 5 == 0 ? DIV_5 : 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextInt(), scanner.nextInt());
    }

    private static void solve(int lo, int hi) {
        IntStream.range(lo, hi + 1).mapToObj(i -> {
            final String res = resMap.get(applyTests(tests, i));
            return res == null ? "" + i : res;
        }).forEach(System.out::println);
    }

    static int applyTests(List<Function<Integer, Integer>> tests, int n) {
        return tests.stream()
                .map(f -> f.apply(n))
                .reduce((r, r2) -> r | r2)
                .orElseThrow();
    }
}
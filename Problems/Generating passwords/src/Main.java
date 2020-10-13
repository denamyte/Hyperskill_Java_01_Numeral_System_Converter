import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a, b, c;
        String pwd = Stream.of(
                new SymbolGenerator(new char[]{'A', 'B'}, a = scanner.nextInt()),
                new SymbolGenerator(new char[]{'a', 'b'}, b = scanner.nextInt()),
                new SymbolGenerator(new char[]{'0', '1'}, c = scanner.nextInt()),
                new SymbolGenerator(new char[]{'>', '<'}, scanner.nextInt() - a - b - c))
                .flatMapToInt(sg -> IntStream.generate(sg::getNext).limit(sg.count))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println(pwd);
    }

    static class SymbolGenerator {
        char[] symbols;
        int count;
        int lastInd = 1;

        SymbolGenerator(char[] symbols, int count) {
            this.symbols = symbols;
            this.count = count;
        }

        char getNext() {
            return symbols[lastInd ^= 1];
        }
    }

}
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    static int M = 0, P = 1, K = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final List<Double> data = DoubleStream.generate(scanner::nextDouble).limit(3).boxed()
                .collect(Collectors.toList());
        double perYear = 1 + data.get(P) / 100;
        System.out.println(
            DoubleStream.iterate(
                data.get(M),
                m -> m < data.get(K),
                m -> m * perYear
            ).count()
        );
    }
}
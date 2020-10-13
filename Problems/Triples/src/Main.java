import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    static List<Triple> started = new ArrayList<>(1);
    static int finished = 0;  // The amount of finished triples

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStream.generate(scanner::nextInt).limit(scanner.nextInt())
            .forEach(Main::checkNext);
        System.out.println(finished);
    }

    private static void checkNext(int next) {
        started = started.stream().filter(triple -> {
            boolean matched = triple.match(next);
            boolean done = matched && triple.finished();
            if (done) {
                finished++;
            }
            return matched && !done;
        }).collect(Collectors.toList());
        started.add(new Triple(next));
    }

    static class Triple {
        int count = 1;
        int prev;

        Triple(int prev) {
            this.prev = prev;
        }

        boolean match(int next) {
            boolean matched = count < 3 && prev + 1 == next;
            if (matched) progress(next);
            return matched;
        }

        private void progress(int next) {
            prev = next;
            count++;
        }

        boolean finished() {
            return count == 3;
        }
    }

}
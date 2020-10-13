import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        new ReadWriteModule(8).io();
    }

    /** A configurable reader/writer */
    static class ReadWriteModule {
        /** How many words to read and write.*/
        int count;

        ReadWriteModule(int count) {
            this.count = count;
        }

        void io() {
            Scanner scanner = new Scanner(System.in);
            List<String> list = new ArrayList<>(count);
            for (int i = 0; i < count; i++) {
                list.add(scanner.next());
            }
            Collections.reverse(list);
            list.forEach(System.out::println);
        }
    }

}
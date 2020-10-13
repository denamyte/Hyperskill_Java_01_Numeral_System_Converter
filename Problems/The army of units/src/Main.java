import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    static List<ArmyRange> ranges = Arrays.asList(
            new ArmyRange(0, "no army"),
            new ArmyRange(19, "pack"),
            new ArmyRange(249, "throng"),
            new ArmyRange(999, "zounds"),
            new ArmyRange(Integer.MAX_VALUE, "legion")
    );

    public static void main(String[] args) {
        final int army = new Scanner(System.in).nextInt();
        final ArmyRange armyRange = ranges.stream()
                .filter(range -> army <= range.hi)
                .findFirst().orElseThrow();
        System.out.println(armyRange.name);
    }

    static class ArmyRange {
        final int hi;
        final String name;

        ArmyRange(int hi, String name) {
            this.hi = hi;
            this.name = name;
        }
    }

}
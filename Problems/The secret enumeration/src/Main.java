import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                Arrays.stream(Secret.values())
                        .map(Enum::name)
                        .filter(name -> name.startsWith("STAR"))
                        .count()
        );
    }
}

enum Secret {
    STAR, CRASH, START, // ...
}
/* At least two constants start with STAR
*/
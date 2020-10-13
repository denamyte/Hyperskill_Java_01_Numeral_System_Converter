import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(new HashMap<>(4) {{
                put("gryffindor", "bravery");
                put("hufflepuff", "loyalty");
                put("slytherin", "cunning");
                put("ravenclaw", "intellect");
        }}.getOrDefault(new Scanner(System.in).next(), "not a valid house"));
    }
}
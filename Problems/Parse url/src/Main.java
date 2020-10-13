import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        String[] split = new Scanner(System.in).nextLine()
                .split("\\?")[1].split("&");
        Map<String, String> map = Arrays.stream(split).map(s -> s.split("="))
            .collect(Collectors.toMap(
                ar -> ar[0],
                ar -> ar.length == 1 ? "not found" : ar[1],
                (o, o2) -> o,
                LinkedHashMap::new));
        if (map.containsKey("pass")) {
            map.put("password", map.get("pass"));
        }
        map.forEach((key, value) -> System.out.printf("%s : %s\n", key, value));
    }
}
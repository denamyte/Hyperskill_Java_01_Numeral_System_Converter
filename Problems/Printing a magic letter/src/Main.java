import java.util.Arrays;

class Main {
    // Let's go veeerbooose! :)
    public static void main(String[] args) {
        Arrays.asList(new Pair("********", 1),
                      new Pair("      **", 3),
                      new Pair("**    **", 2),
                      new Pair(" *******", 1)
        ).forEach(pair -> {
            for (int i = 0; i < pair.times; i++) {
                System.out.println(pair.text);
            }
        });
    }

    static class Pair {
        String text;
        int times;

        Pair(String text, int times) {
            this.text = text;
            this.times = times;
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = validateRange(scanner.nextInt());  // the pole height
        int a = validateRange(scanner.nextInt());  // feet per day
        int b = validateRange(scanner.nextInt());  // feet down per night
        validateDependencies(h, a, b);
        System.out.println(calculateDuration(h, a, b));
    }

    public static int validateRange(int value) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException("value must be in the range [0 .. 100]");
        }
        return value;
    }

    public static void validateDependencies(int h, int a, int b) {
        if (h <= b || a <= b) {
            throw new IllegalArgumentException("'h' abd 'a' must be > than 'b'");
        }
    }

    /**
     * @param h The height of the pole
     * @param a The distance the snail travels up during a day
     * @param b The distance the snail travels down during a night
     * @return The amount of days it takes to the snail to reach the top of the pole
     * <br>
     * <br><b>Explanations:</b>
     * <pre>(h - a)  // the distance without one day of travelling up the pole (it is compensated in "1 +- expr" )</pre>
     * <pre>(double) a  // 'a' converted to double so that the whole expression would be double</pre>
     * <pre>(double) a - b  // the distance the snail travels during a day and a night</pre>
     * <pre>(h - a) / ((double) a - b)  // the amount of days it takes to the snail to travel the remainder
     *(after the first day) of the distance</pre>
     * <pre>Math.ceil(...)  // supplements to integer the possible fractional result of the previous expression
     *(a part of the last travelling day becomes a whole day)</pre>
     * <pre>(int) (expression)  // converts to integer the result of the previous expression which is double
     *at the moment</pre>
     */
    public static int calculateDuration(int h, int a, int b) {
        return a < h
                ? 1 + (int) (Math.ceil((h - a) / ((double) a - b)))
                : 1;
    }

}
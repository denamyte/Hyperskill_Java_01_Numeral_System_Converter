package converter;

import java.util.stream.DoubleStream;

public class Stage5 {

    public static final String DIGITS = "0123456789abcdefghijklmnopqrstuvwxyz";
    private static final int FRACTIONAL_COUNT = 5;

    private final int srcRadix;
    private final String fractional;
    private final int destRadix;

    public final String result;

    public Stage5(int srcRadix, String fractional, int destRadix) {
        this.srcRadix = srcRadix;
        this.fractional = fractional;
        this.destRadix = destRadix;
        result = convert();
    }

    private String convert() {
        double decimal = srcRadix != 10 ? toDecimal() : Double.parseDouble("0." + fractional);
        return toRadix(decimal);
    }

    private double toDecimal() {
        double[] bases = DoubleStream.iterate(srcRadix, i -> i * srcRadix).limit(fractional.length()).toArray();
        double sum = 0;
        for (int i = 0; i < bases.length; i++) {
            double digit = DIGITS.indexOf(fractional.charAt(i));
            sum += digit / bases[i];
        }
        return sum;
    }

    private String toRadix(double decimal) {
        if (decimal == 0) {
            return "0".repeat(FRACTIONAL_COUNT);
        }
        char[] fracPart = new char[FRACTIONAL_COUNT];
        for (int i = 0; i < FRACTIONAL_COUNT; i++) {
            decimal *= destRadix;
            int digitIndex = (int) decimal;
            fracPart[i] = DIGITS.charAt(digitIndex);
            decimal -= digitIndex;
        }
        return String.valueOf(fracPart);
    }
}

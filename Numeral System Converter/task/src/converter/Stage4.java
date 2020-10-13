package converter;

public class Stage4 {

    String result;

    public Stage4(int srcRadix, String number, int destRadix) {
        int decimal = srcRadix > 1
                ? Integer.parseInt(number, srcRadix)
                : number.length();
        this.result = destRadix > 1
                ? Integer.toString(decimal, destRadix)
                : "1".repeat(decimal);
    }
}

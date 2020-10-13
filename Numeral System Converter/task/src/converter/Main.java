package converter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int srcRadix = nextInt(scanner);
        checkRadix(srcRadix);

        String number = scanner.next();
        checkNumberInRadix(number, srcRadix);

        int destRadix = nextInt(scanner);
        checkRadix(destRadix);

        String[] numAr = number.split("\\.");  // [<integer>[, <fractional>]]
        checkDotsInNumber(numAr);
        checkNumberParts(numAr);

        numAr[0] = new Stage4(srcRadix, numAr[0], destRadix).result;

        if (numAr.length == 2) {
            numAr[1] = new Stage5(srcRadix, numAr[1], destRadix).result;
        }
        System.out.println(String.join(".", numAr));
    }

    static int nextInt(Scanner scanner) {
        String s = scanner.next();
        if (s.matches("\\d+")) {
            return Integer.parseInt(s);
        }
        return 0;
    }

    static void checkRadix(int srcRadix) {
        if (srcRadix < 1 || 36 < srcRadix) {
            errorOccurred("error: one of the radices is not a number or out of range [1, 36]");
        }
    }

    static void checkNumberInRadix(String number, int radix) {
        String digits = radix == 1 ? "1" : Stage5.DIGITS.substring(0, radix) + ".";
        for (char c : number.toCharArray()) {
            if (-1 == digits.indexOf(c)) {
                errorOccurred("error: the number is wrong or of not appropriate radix");
            }
        }
    }

    static void checkDotsInNumber(String[] numAr) {
        if (numAr.length > 2) {
            errorOccurred("error: the number of dots in the number is greater than 1");
        }
    }

    static void checkNumberParts(String[] numAr) {
        if (Arrays.binarySearch(numAr, "") > -1) {
            errorOccurred("error: the integer of the fractional part of the number cannot be empty");
        }
    }

    static void errorOccurred(String error) {
        System.out.println(error);
        System.exit(-1);
    }

}

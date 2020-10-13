import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String vowels = "aeiouy";
        String[] word = new Scanner(System.in).next().split("");
        boolean isVowel = false;
        int count = 0;
        int inserts = 0;
        for (String letter: word) {
            if (isVowel ^ vowels.contains(letter)) { // If they are different
                inserts += (count - 1) / 2;
                count = 1;
                isVowel = !isVowel;
            } else {
                count++;
            }
        }
        inserts += (count - 1) / 2;
        System.out.println(inserts);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] chars = new Scanner(System.in).nextLine().toCharArray();
        StringBuilder sb = new StringBuilder("" + chars[0]);
        int counter = 1;
        for (int i = 1; i < chars.length; i++) {
            if (sb.charAt(sb.length() - 1) == chars[i]) {
                counter++;
            } else {
                sb.append(counter).append(chars[i]);
                counter = 1;
            }
        }
        System.out.println(sb.append(counter).toString());
    }
}
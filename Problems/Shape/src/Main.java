import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(test(new Scanner(System.in).nextInt()));
    }

    static String test(int n) {
        final String part = "You have chosen a ";
        switch (n) {
            case 1: return part + "square";
            case 2: return part + "circle";
            case 3: return part + "triangle";
            case 4: return part + "rhombus";
            default: return "There is no such shape!";
        }
    }
}
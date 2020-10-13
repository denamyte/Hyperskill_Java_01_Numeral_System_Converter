import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(inputAndSolve());
    }

    static double inputAndSolve() {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "triangle": return triangleArea(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            case "rectangle": return rectangleArea(scanner.nextDouble(), scanner.nextDouble());
            default: return circleArea(scanner.nextDouble());
        }
    }

    static double triangleArea(double a, double b, double c) {
        // half-perimeter
        double p = (a + b + c) / 2;
        // Heron's formula
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double rectangleArea(double a, double b) {
        return a * b;
    }

    static double circleArea(double r) {
        return 3.14 * r * r;
    }
}
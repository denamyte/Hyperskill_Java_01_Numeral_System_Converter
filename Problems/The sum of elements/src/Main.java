import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).tokens()
                .mapToInt(Integer::parseInt)
                .takeWhile(n -> n != 0).sum());
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int i;
//        while ((i = scanner.nextInt()) != 0) {
//            sum += i;
//        }
//        System.out.println(sum);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int option = new Scanner(System.in).nextInt();
        String result;
        switch (option) {
            case 1: result = "Yes!";
                break;
            case 2: case 3: case 4: result = "No!";
                break;
            default: result = "Unknown number";
                break;
        }
        System.out.println(result);
    }
}
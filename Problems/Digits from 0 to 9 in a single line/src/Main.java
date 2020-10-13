class Main {
    public static void main(String[] args) {
        int end = 0;
        for (int i = 9; i >= end; i--) {
            System.out.print(i);
            if (i > end) {
                System.out.print(" ");
            }
        }
    }
}
class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes = (minutes + 1) % 60;
        hours = minutes > 0 ? hours : hours % 12 + 1;
    }

    // Uncomment and use some tests below
//    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.minutes = 59;
//        print(clock);
//        clock.next();
//        print(clock);
//        clock.next();
//        print(clock);
//
//        clock.minutes = 58;
//        print(clock);
//        clock.next();
//        print(clock);
//        clock.next();
//        print(clock);
//    }
//
//    static void print(Clock clock) {
//        System.out.printf("hours: %d, minutes: %d\n", clock.hours, clock.minutes);
//    }
}
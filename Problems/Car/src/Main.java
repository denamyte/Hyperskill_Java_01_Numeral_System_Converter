class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        speed += 5;
    }

    void brake() {
        speed -= Math.min(speed, 5);
    }
}
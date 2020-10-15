class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = robot.getX() - toX;
        int dy = robot.getY() - toY;
        while (dx != 0 || dy != 0) {
            if (!directed(dx, dy, robot.getDirection())) {
                if (directed(dx, dy, robot.getDirection().turnLeft())) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                    if (!directed(dx, dy, robot.getDirection())) {
                        robot.turnRight();
                    }
                }
            }
            robot.stepForward();
            dx = robot.getX() - toX;
            dy = robot.getY() - toY;
        }
    }

    static boolean directed(int dx, int dy, Direction direction) {
        return diffSigns(dx, direction.dx()) || diffSigns(dy, direction.dy());
    }

    static boolean diffSigns(int a, int b) {
        return a < 0 && b > 0 || a > 0 && b < 0;
    }

    public static void main(String[] args) {
        Robot robot = new Robot(5, -10, Direction.UP);
        moveRobot(robot, 15, 15);
        System.out.printf("robot.x = %d, robot.y = %d", robot.getX(), robot.getY());
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
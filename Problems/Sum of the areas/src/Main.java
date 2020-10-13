import java.util.Arrays;

class Sum {
    public static int sumOfAreas(Shape[] array) {
        return Arrays.stream(array).mapToInt(shape -> {
            if (shape instanceof Square) {
                Square s = (Square) shape;
                return s.getSide() * s.getSide();
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                return r.getWidth() * r.getHeight();
            }
            return 0;
        }).sum();
    }

//    public static void main(String[] args) {
//        Square s = new Square();
//        s.setSide(2);
//        Rectangle r = new Rectangle();
//        r.setHeight(5);
//        r.setWidth(3);
//        System.out.println(sumOfAreas(new Shape[] {
//                new Shape(), // 0
//                s,           // 4
//                r            // 15
//        }));  // 19
//    }
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
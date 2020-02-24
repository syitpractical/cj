import java.lang.*;

class area {
    public area(int r) {
        System.out.println("Area of a circle: " + (3.14 * r * r));
    }

    public area(int l, int b) {
        System.out.println("Area of a rectangle: " + (l * b));
    }
}

class ConstructorAndDestructor {
    public static void main(String[] args) {
        area s = new area(16);

        area s1 = new area(15, 15);
    }
}
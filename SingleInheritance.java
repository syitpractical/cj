import java.util.*;

class display {
    public void disp() {
        System.out.print("Area of circle: ");
    }
}

class area extends display {
    public void area1(int r) {
        System.out.println(3.14 * r * r);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = s.nextInt();
        area a = new area();
        a.disp();
        a.area1(r);
    }
}
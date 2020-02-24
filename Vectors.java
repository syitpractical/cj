import java.util.*;

class Vectors {
    public static void main(String[] args) {
        int i;
        Vector<String> v = new Vector<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values:");
        for (i = 0; i < 12; i++) {
            v.add(s.nextLine());
        }
        System.out.println("Elements in vector: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());
        System.out.println("5th element: " + v.get(4));
        v.remove(2);
        System.out.println("Is march present: " + v.contains("march"));
        v.setSize(50);
        System.out.println("Size: " + v.size());
    }
}
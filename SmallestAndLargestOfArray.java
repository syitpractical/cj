import java.util.*;

class SmallestAndLargestOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int[] a = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
    }
}
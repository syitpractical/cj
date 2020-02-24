import java.util.*;
import java.lang.Math;

class SortDataInAscAndDesc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array in ascending order: ");
        ascend(a);
        System.out.println("Array in desscending order: ");
        descend(a);
    }

    public static void ascend(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t;
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            System.out.println(a[i] + " ");
        }
    }

    public static void descend(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int t;
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            System.out.println(a[i] + " ");
        }
    }
}
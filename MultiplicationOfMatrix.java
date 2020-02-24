import java.util.*;

class MultiplicationOfMatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements for Matrix 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements for Matrix 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("Multiplication of Matrix Is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
                sum = 0;
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
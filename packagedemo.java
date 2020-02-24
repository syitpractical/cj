import java.util.Scanner;

import mathematics.*;

class packagedemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NO FOR SQUARE");
        int n = s.nextInt();
        System.out.println("ENTER NO FOR CUBE");
        int a = s.nextInt();
        System.out.println("Square = " + mathematics.mathmethods.sqr(n));
        System.out.println("Cube = " + mathematics.mathmethods.cube(a));
    }
}
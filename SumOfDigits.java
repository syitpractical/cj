import java.util.*;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        String a = s.nextLine();
        char[] c = a.toCharArray();
        int l = c.length;
        total(c);
    }

    public static void total(char[] c) {
        int ans = 0, l = c.length;
        for (int i = 0; i < l; i++) {
            ans = ans + Character.getNumericValue(c[i]);
        }
        System.out.println("Sum of digits in array: " + ans);
    }
}
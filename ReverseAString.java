import java.util.*;

class ReverseAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = s.nextLine();
        char[] c = a.toCharArray();
        int l = c.length;
        String rev = "";
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + c[i];
        }
        System.out.print("Reverse of string: " + a + ": is :" + rev);
    }
}
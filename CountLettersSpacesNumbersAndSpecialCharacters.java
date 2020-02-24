import java.util.*;

class CountLettersSpacesNumbersAndSpecialCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = s.nextLine();
        char[] c = a.toCharArray();
        int l = c.length;
        int digit = 0, alpha = 0, space = 0, other = 0;
        for (int i = 0; i < l; i++) {
            if (Character.isLetter(c[i])) {
                alpha++;
            } else if (Character.isDigit(c[i])) {
                digit++;
            } else if (Character.isSpaceChar(c[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("No. of characters: " + alpha);
        System.out.println("No. of digits: " + digit);
        System.out.println("No. of spaces: " + space);
        System.out.println("No. of other characters: " + other);
    }
}
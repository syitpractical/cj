import java.util.*;
import java.io.*;

class OpenFileAndDisplayContentsInConsole {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the file name:");
        String str = s.nextLine();
        try {
            File f = new File(str);
            FileReader r = new FileReader(f);
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.print("Error");
        }
    }
}
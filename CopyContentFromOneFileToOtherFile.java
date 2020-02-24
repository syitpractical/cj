import java.io.*;

class CopyContentFromOneFileToOtherFile {
    public static void main(String[] args) {
        try {
            int c;
            FileInputStream fis = new FileInputStream("abc.txt");
            FileOutputStream fos = new FileOutputStream("xyz.txt");
            while ((c = fis.read()) != -1)
                fos.write(c);
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
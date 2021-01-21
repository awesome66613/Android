import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        filechange();
    }

    public static void filechange() {
        try {
            FileInputStream fis = new FileInputStream("text1.txt");
            FileOutputStream fos = new FileOutputStream("text3.txt");
            int outbox;
            while ((outbox = fis.read()) != -1) {
                fos.write(outbox);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            FileInputStream fis = new FileInputStream("text2.txt");
            FileOutputStream fos = new FileOutputStream("text3.txt", true);
            int outbox;
            while ((outbox = fis.read()) != -1) {
                fos.write((char) outbox);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }


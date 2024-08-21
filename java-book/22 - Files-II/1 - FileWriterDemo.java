import java.io.FileWriter;

public class FileWriterDemo {

    public static void main(String[] args) throws Exception {
        String source = "I am programmer";

        char buffer[] = new char[source.length()];

        source.getChars(0, source.length(), buffer, 0);

        FileWriter f1 = new FileWriter("src/test.txt");

        for (int i = 0; i < buffer.length; i += 2)
        {
            f1.write(buffer[i]);
        }
        f1.close();

        FileWriter f2 = new FileWriter("src/test2.txt");

        for (int i = 0; i < buffer.length; i++)
        {
            f2.write(buffer[i]);
        }
        f2.close();

    }
}

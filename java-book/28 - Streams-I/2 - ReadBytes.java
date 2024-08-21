import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBytes {

    public static void main(String[] args) {

        // create file input file stream
        FileInputStream infile = null;

        int a;

        try {
            // connect file stream to the required file
            infile = new FileInputStream("src/test.txt");

            // read and display data
            while ( ( a=infile.read() ) != -1)
            {
                System.out.print((char) a);
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}

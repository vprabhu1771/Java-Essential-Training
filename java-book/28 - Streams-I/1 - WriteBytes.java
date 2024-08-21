import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {
    public static void main(String[] args) {

        byte cities[] = {'c','u','d','d','l','a','o','r','e'};

        // create an output file stream
        FileOutputStream ofile = null;

        try
        {
            // connect the output file stream to test.txt
            ofile = new FileOutputStream("src/test.txt");

            // write data to the stream
            ofile.write(cities);

            ofile.close();

        } catch (IOException ioe) {

            System.out.println(ioe);
        }
    }
}

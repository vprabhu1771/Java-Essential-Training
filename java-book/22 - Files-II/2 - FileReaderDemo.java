import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/test.txt");

        BufferedReader br = new BufferedReader(fr);

        String s;

        while ( (s = br.readLine()) != null)
        {
            System.out.println(s);
        }

        fr.close();
    }
}

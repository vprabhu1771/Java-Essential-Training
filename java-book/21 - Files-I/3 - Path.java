import java.io.File;
import java.io.IOException;

public class Path {
    public static void main(String[] args) {

        File f = new File("test.txt");

        try
        {
            f.createNewFile();

            System.out.println(f.getPath());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

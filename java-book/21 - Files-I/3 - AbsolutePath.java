import java.io.File;
import java.io.IOException;

public class AbsolutePath {
    public static void main(String[] args) {

        File f = new File("test.txt");

        try
        {
            f.createNewFile();

            System.out.println(f.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

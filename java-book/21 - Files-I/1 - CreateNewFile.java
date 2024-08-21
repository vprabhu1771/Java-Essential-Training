import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {

        File f = new File("test.txt");

        try
        {
            f.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

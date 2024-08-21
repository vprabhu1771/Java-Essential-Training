import java.io.File;
import java.io.IOException;

public class FileName {
    public static void main(String[] args) {

        File f = new File("test.txt");

        try
        {
            f.createNewFile();

            System.out.println(f.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

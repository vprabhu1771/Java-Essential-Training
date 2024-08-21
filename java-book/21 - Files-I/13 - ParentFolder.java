import java.io.File;
import java.io.IOException;

public class ParentFolder {
    public static void main(String[] args) {

        File f = new File("src/test.txt");

        try
        {
            f.createNewFile();

            System.out.println(f.getParent());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

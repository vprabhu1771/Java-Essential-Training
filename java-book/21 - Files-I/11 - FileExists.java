import java.io.File;
import java.io.IOException;

public class FileExists {
    public static void main(String[] args) {

        File f = new File("src/test.txt");

        //            f.createNewFile();

        if (f.exists())
        {
            System.out.println("File Exists");
        }
        else
        {
            System.out.println("File Not Exists");
        }


    }
}

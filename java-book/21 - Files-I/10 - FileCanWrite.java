import java.io.File;

public class FileCanWrite {
    public static void main(String[] args) {

        File f = new File("src/test.txt");

        try {
            f.createNewFile();

            if (f.canWrite())
            {
                System.out.println("File is Writable");
            }
            else
            {
                System.out.println("File is not Writable");
            }

        }
        catch (Exception obj)
        {

        }



    }
}

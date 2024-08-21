import java.io.File;

public class FileCanRead {
    public static void main(String[] args) {

        File f = new File("src/test.txt");

        try {
            f.createNewFile();

            if (f.canRead())
            {
                System.out.println("File is Readable");
            }
            else
            {
                System.out.println("File is not Readable");
            }

        }
        catch (Exception obj)
        {

        }



    }
}

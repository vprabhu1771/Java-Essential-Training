import java.io.File;

public class IsDirectory {
    public static void main(String[] args) {

        File f = new File("src");

        try {
            f.createNewFile();

            if (f.isDirectory())
            {
                System.out.println(f.getName() + " is a directory");
            }
            else
            {
                System.out.println(f.getName() + " is not a directory");
            }

        }
        catch (Exception obj)
        {

        }



    }
}

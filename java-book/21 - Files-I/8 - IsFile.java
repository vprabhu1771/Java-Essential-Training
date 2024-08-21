import java.io.File;

public class IsFile {
    public static void main(String[] args) {

        File f = new File("src/test.txt");

        try {
            f.createNewFile();

            if (f.isFile())
            {
                System.out.println(f.getName() + " is a file");
            }
            else
            {
                System.out.println(f.getName() + " is not a file");
            }

        }
        catch (Exception obj)
        {

        }



    }
}

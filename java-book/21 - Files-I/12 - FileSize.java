import java.io.File;

public class FileSize {
    public static void main(String[] args) {

        File f = new File("src/test.txt");

        try {
            f.createNewFile();


            System.out.println(f.getName() + " is a file");

            System.out.println("File Size : " + f.length() + " bytes");

        }
        catch (Exception obj)
        {

        }



    }
}

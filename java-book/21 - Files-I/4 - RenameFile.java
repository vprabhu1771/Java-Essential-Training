import java.io.File;

public class RenameFile {
    public static void main(String[] args) {

        File f = new File("src/test.txt");

        //            f.createNewFile();

        if (f.exists())
        {
            System.out.println("File Exists");

            File student = new File("src/test.txt");

            f.renameTo(student);
            

        }
        else
        {
            System.out.println("File Not Exists");
        }


    }
}

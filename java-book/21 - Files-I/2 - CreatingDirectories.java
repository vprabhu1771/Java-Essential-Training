import java.io.File;

public class CreatingDirectories {
    public static void main(String[] args) {

        File root = new File("src/root");

        if (root.mkdir())
        {
            System.out.println("Created a directory");
        }
        else
        {
            System.out.println("unable to create a directory");
        }
    }
}

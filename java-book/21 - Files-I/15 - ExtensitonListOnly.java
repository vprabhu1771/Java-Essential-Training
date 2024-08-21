import java.io.File;

public class ExtensitonListOnly {

    public static void main(String[] args) {
        String directory_name = "src";

        File path = new File(directory_name);

        FilterNameUsingExtension obj = new FilterNameUsingExtension("html");

        String files_list[] = path.list(obj);

        for (int i = 0; i < files_list.length; i++)
        {
            System.out.println(files_list[i]);
        }
    }
}

import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {

        String directory_name = "src";

        File f1  = new File(directory_name);

        if (f1.isDirectory())
        {
            System.out.print("Directory of ");

            System.out.println(directory_name);

            // get list of directory inside src eg: songs, movies
            String directory_list[] = f1.list();

            for(int i = 0; i < directory_list.length; i++)
            {
                File element = new File(directory_name + "/" + directory_list[i]);

                if (element.isDirectory())
                {
                    System.out.println(directory_list[i] + " is a directory");
                }
                else
                {
                    System.out.println(directory_list[i] + " is a file");
                }
            }
        }
        else {
            System.out.println(directory_name + " is not a directory");
        }


    }
}

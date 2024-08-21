import java.io.File;
import java.io.FilenameFilter;

public class FilterNameUsingExtension implements FilenameFilter {

    String extension;

    public FilterNameUsingExtension(String ext)
    {
        this.extension = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extension);
    }
}

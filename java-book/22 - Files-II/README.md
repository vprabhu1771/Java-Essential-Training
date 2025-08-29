# 1 - `FileWriterDemo.java`
```java
import java.io.FileWriter;

public class FileWriterDemo {

    public static void main(String[] args) throws Exception {
        String source = "I am programmer";

        char buffer[] = new char[source.length()];

        source.getChars(0, source.length(), buffer, 0);

        FileWriter f1 = new FileWriter("src/test.txt");

        for (int i = 0; i < buffer.length; i += 2)
        {
            f1.write(buffer[i]);
        }
        f1.close();

        FileWriter f2 = new FileWriter("src/test2.txt");

        for (int i = 0; i < buffer.length; i++)
        {
            f2.write(buffer[i]);
        }
        f2.close();

    }
}
```

# 2 - `FileReaderDemo.java`
```java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/test.txt");

        BufferedReader br = new BufferedReader(fr);

        String s;

        while ( (s = br.readLine()) != null)
        {
            System.out.println(s);
        }

        fr.close();
    }
}
```
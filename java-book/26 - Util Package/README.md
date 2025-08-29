# 1 - `STDemo.java`
```java
import java.util.StringTokenizer;

public class STDemo {

    static String input = "title=Java: The Complete Reference;" + "author=schildt;" + "publisher=Osborne/McGraw-Hill;" + "copyright=2002;";

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer(input,"=;");

        while (st.hasMoreTokens())
        {
            String key = st.nextToken();

            String value = st.nextToken();

            System.out.print("Key : " + key);

            System.out.println("\tValue : " + value);
        }

    }
}
```
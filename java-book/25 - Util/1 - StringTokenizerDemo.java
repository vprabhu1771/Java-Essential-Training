import java.util.StringTokenizer;

public class StringTokenizerDemo {

    static String input = "title=Java:The Complete Reference;" +
            "author=Schildt;" +
            "publisher=Osborne/McGraw-Hill;" +
            "copyright=2002;";

    public static void main(String[] args) {

        StringTokenizer obj = new StringTokenizer(input,"=;");

        while (obj.hasMoreTokens())
        {
            String key = obj.nextToken();

            String value = obj.nextToken();

            System.out.println(key + " => " + value);
        }

    }
}

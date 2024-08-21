import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamReset {

    public static void main(String[] args) throws IOException {
        String data = "abcd";

        byte a[] = data.getBytes();

        ByteArrayInputStream input = new ByteArrayInputStream(a);

        for(int i = 0; i < 2; i++)
        {
            int c;

            while ( (c=input.read()) != -1)
            {
                if (i==0)
                {
                    System.out.println((char) c);
                }
                else
                {
                    System.out.println(Character.toUpperCase((char) c));
                }

            }

            System.out.println();

            input.reset();
        }
    }
}

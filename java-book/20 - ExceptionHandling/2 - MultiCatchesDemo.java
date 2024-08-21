public class MultiCatchesDemo {

    public static void main(String[] args) {

        try
        {
            int len = args.length;

            System.out.println("Length = " + len);

            int a = 42 / len;

            System.out.println(a);
            // end of divivison

            // initialize array
            int c[] = {10,20,30,40};

            // cause array index out of bound exception
            c[42] = 99;
        }
        catch (ArithmeticException errorObj)
        {
            System.out.println(errorObj);
        }
        catch (ArrayIndexOutOfBoundsException errorObj)
        {
            System.out.println(errorObj);
        }
    }
}

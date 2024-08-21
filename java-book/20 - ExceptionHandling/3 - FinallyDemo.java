public class FinallyDemo {

    public static void main(String[] args) {

        try
        {
            int a = 7;

            int b = a / 3;

            System.out.println(b);
        }
        catch (ArithmeticException errorObj)
        {
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Finally Statement Execute");
        }
    }
}

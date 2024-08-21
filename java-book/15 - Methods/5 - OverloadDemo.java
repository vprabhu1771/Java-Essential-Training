public class OverloadDemo {
    void multi()
    {
        System.out.println("No Values to multiply");
    }

    void multi(int a)
    {
        System.out.print(a + " * " + a + " : ");

        System.out.println(a*a);
    }

    void multi(int a, int b)
    {
        System.out.print(a + " * " + b + " : ");

        System.out.println(a*b);
    }

    double multi(double a)
    {
        return a*a;
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        double result;

        obj.multi();

        obj.multi(10);

        obj.multi(10,20);

        result = obj.multi(2.0);

        System.out.println("Result : " + result);
    }
}

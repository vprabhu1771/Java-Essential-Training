public class CallByValueDemo {

    void multi(int a)
    {
        System.out.print(a + " * " + a + " : ");

        System.out.println(a*a);
    }

    public static void main(String[] args) {
        CallByValueDemo obj = new CallByValueDemo();

        obj.multi(2);
    }
}

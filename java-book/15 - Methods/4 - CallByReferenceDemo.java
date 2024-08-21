public class CallByReferenceDemo {
    int a;
    int b;
    void multi(CallByReferenceDemo obj)
    {
        System.out.print(obj.a + " * " + obj.b + " : ");

        System.out.println(obj.a * obj.b);
    }

    public static void main(String[] args) {
        CallByReferenceDemo obj = new CallByReferenceDemo();

        CallByReferenceDemo test = new CallByReferenceDemo();

        test.a = 10;
        test.b = 2;

        obj.multi(test);
    }
}

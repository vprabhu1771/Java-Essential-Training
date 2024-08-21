public class Person {
    private String name;
    private int age;

    void setData(String n, int a)
    {
        this.name = n;
        this.age = a;
    }

    void getData()
    {
        System.out.println("Name is " + name);

        System.out.println("Age is " + age);
    }
}

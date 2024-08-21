public class Person2 {
    String name;

    int age;

    Person2()
    {
        System.out.println("Default Constructor");
    }

    Person2(String n)
    {
        this.name = n;

        this.age = 0;
    }

    Person2(String n, int a)
    {
        this.name = n;

        this.age = a;
    }

    void getName()
    {
        System.out.println("Name is : " + this.name);
    }

    void getAge()
    {
        System.out.println("Age is : " + this.age);
    }
}

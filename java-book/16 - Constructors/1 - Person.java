public class Person {
    String name;

    int age;

    void setName(String n)
    {
        this.name = n;
    }

    void setAge(int a)
    {
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

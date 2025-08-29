# 1 - `Person.java`
```java
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
```

# 2 - `AccessTestDemo.java`
```java
public class AccessTestDemo {

    public static void main(String[] args) {
        Person obj = new Person();

        obj.setData("prabhu", 22);

        obj.getData();
    }
}
```
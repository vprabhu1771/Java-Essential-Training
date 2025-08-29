# 1 - `Person.java`
```java
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
```

# 2 - `Person2.java`
```java
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
```

# 3 - `PersonDemo.java`
```java
public class PersonDemo {

    public static void main(String[] args) {
        Person2 obj = new Person2("raja",22);

        obj.getName();

        obj.getAge();
    }
}
```
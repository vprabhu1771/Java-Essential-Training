# 1 - `Box.java`
```java
public class Box {
    double width,height,depth;

    // displaying value
    void volume()
    {
        System.out.print("Volume is : ");

        System.out.println(width*height*depth);
    }

    // returning value
    double volumee()
    {
        return width*height*depth;
    }

    // setting diminsion
    void setDim(double w, double h, double d)
    {
        this.width = w;
        
        this.height = h;

        this.depth = d;
    }
}
```

# 2 - `BoxDemo.java`
```java
public class BoxDemo {
    public static void main(String[] args) {
        Box obj = new Box();

        obj.setDim(2,2,2);

        System.out.print("Width : ");

        System.out.println(obj.width);

        System.out.print("Height : ");

        System.out.println(obj.height);

        System.out.print("Depth : ");

        System.out.println(obj.depth);

        System.out.println(obj.volumee());
    }
}
```

# 3 - `CallByValueDemo.java`
```java
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
```

# 4 - `CallByReferenceDemo.java`
```java
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
```

# 5 - `OverloadDemo.java`
```java
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
```
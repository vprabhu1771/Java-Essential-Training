# 1 - VariableDeclarationDemo
```java
public class VariableDeclarationDemo {

    public static void main(String[] args) {

        // variable names in java cannot start with special character
//        int @a;

        // variable names in java cannot start with number
//        int 1b;

        // variable names in java can start with $ dollar sign
//        int $c;

        // variable names in java can start with _ underscore sign
//        int _d;

    }
}
```

# 2 - IntegerDemo
```java
public class IntegerDemo {

    public static void main(String[] args) {
        int year, days;

        long noday, seconds;

        year = 100;

        days = 365;

        System.out.print("One Day\t:\t");

        System.out.println(24 + " Hour");

        System.out.print("One Hour\t:\t");

        System.out.println(60 + " Minutes");

        System.out.print("One Second\t:\t");

        System.out.println(60 + " Mili Seconds");

        System.out.print("No of Days\t:\t");

        System.out.println(days);

        System.out.print("No of Years\t:\t");

        System.out.println(year);

        // calculate no of days for 100 years
        noday = year * days;

        System.out.print("No of Days\t:\t");

        System.out.println(noday);

        // calculate no of seconds for no of days
        seconds = noday * 24 * 60 * 60;

        System.out.print("No of Seconds\t:\t");

        System.out.println(seconds);
    }
}
```

# 3 - DoubleDemo
```java
public class DoubleDemo {
    public static void main(String[] args) {

        double area;

        float radius, pi;

        radius = 10.8f;

        pi = 3.1416F;

        area = pi * radius * radius;

        System.out.print("Area of Circle is ");

        System.out.println(area);
    }
}
```

# 4 - CharacterDemo
```java
public class CharacterDemo {

    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 'A';

        ch2 = ch1;

        System.out.print("ch1\t:\t");

        System.out.println(ch1);

        System.out.print("ch2\t:\t");

        System.out.println(ch2);
    }
}
```

# 5 - StringDemo
```java
public class StringDemo {

    public static void main(String[] args) {
        String name = "Prabhu";

        System.out.print("Name is\t:\t");

        System.out.println(name);
    }
}
```

# 6 - BooleanDemo
```java
public class BooleanDemo {

    public static void main(String[] args) {
        int age = 18;

        boolean result;

        result = age >= 18;

        System.out.println(result);

        if (result)
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            System.out.println("You are not eligible for voting");
        }
    }
}
```

# 7 - ConversionDemo
```java
public class ConversionDemo {

    public static void main(String[] args) {

        float a = 18.7F;

        int b = (int) a;

        System.out.println(b);
    }
}
```
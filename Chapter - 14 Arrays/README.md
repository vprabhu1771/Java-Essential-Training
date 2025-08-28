# 1 - IntegerArrayDemo
```
public class IntegerArrayDemo {

    public static void main(String[] args) {

        int i;

        // array initilization
        int data[] = {10,20,30,40};

        for (i = 0; i < data.length; i++)
        {
            System.out.print("Index : " + i + " -> ");

            System.out.println(data[i]);
        }
    }
}
```

Output
```
Index : 0 -> 10

Index : 1 -> 20

Index : 2 -> 30

Index : 3 -> 40
```

# 2 - FloatArrayDemo
```
public class FloatArrayDemo {

    public static void main(String[] args) {

        int i;

        // array initilization
        float data[] = {10F,20F,30F,40F};

        for (i = 0; i < data.length; i++)
        {
            System.out.print("Index : " + i + " -> ");

            System.out.println(data[i]);
        }
    }
}
```

Output
```
Index : 0 -> 10.0

Index : 1 -> 20.0

Index : 2 -> 30.0

Index : 3 -> 40.0
```

# 3 - DoubleArrayDemo
```
public class DoubleArrayDemo {

    public static void main(String[] args) {

        int i;

        // array initilization
        double data[] = {10,20,30,40};

        for (i = 0; i < data.length; i++)
        {
            System.out.print("Index : " + i + " -> ");

            System.out.println(data[i]);
        }
    }
}
```

Output
```
Index : 0 -> 10.0

Index : 1 -> 20.0

Index : 2 -> 30.0

Index : 3 -> 40.0
```

# 4 - CharacterArrayDemo
```
public class CharacterArrayDemo {

    public static void main(String[] args) {

        int i;

        // array initilization
        char data[] = {'p','r','a','b','h','u'};

        for (i = 0; i < data.length; i++)
        {
            System.out.print("Index : " + i + " -> ");

            System.out.println(data[i]);
        }
    }
}
```

Output
```
Index : 0 -> p

Index : 1 -> r

Index : 2 -> a

Index : 3 -> b

Index : 4 -> h

Index : 5 -> u
```

# 5 - StringArrayDemo
```
public class StringArrayDemo {

    public static void main(String[] args) {

        int i;

        // array initilization
        String fruits[] = {"apple","Orange","Banana","Pineapple","Mango"};

        for (i = 0; i < fruits.length; i++)
        {
            System.out.print("Index : " + i + " -> ");

            System.out.println(fruits[i]);
        }
    }
}
```

Output
```
Index : 0 -> apple

Index : 1 -> Orange

Index : 2 -> Banana

Index : 3 -> Pineapple

Index : 4 -> Mango
```

# 6 - StringDemo
```
public class StringDemo {

    public static void main(String[] args) {

        int i;

        // array initilization
        String data = "prabhu";

        for (i = 0; i < data.length(); i++)
        {
            System.out.print("Index : " + i + " -> ");

            System.out.println(data.charAt(i));
        }
    }
}
```

Output
```
Index : 0 -> p

Index : 1 -> r

Index : 2 -> a

Index : 3 -> b

Index : 4 -> h

Index : 5 -> u
```
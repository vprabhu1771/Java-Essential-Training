# 1 - While Loop Demo
```
public class WhileLoopDemo {

    public static void main(String[] args) {
        int count = 1;

        while (count <= 4)
        {
            System.out.println("Count : " + count);
            count++;
        }

    }
}
```

Output
```
Count : 1
Count : 2
Count : 3
Count : 4
```

# 2 - Do While Loop Demo
```
public class DoWhileLoopDemo {

    public static void main(String[] args) {
        int count = 10;

        do
        {
            System.out.println("Count : " + count);
            count++;

        }while (count <= 4);

    }
}
```

Output
```
Count : 10
```

# 3 - For Loop Demo
```
public class ForLoopDemo {

    public static void main(String[] args) {
        int count = 1;

        for (count = 1; count <= 4;count++)
        {
            System.out.println("Count : " + count);
        }
    }
}
```

Output
```
Count : 1
Count : 2
Count : 3
Count : 4
```

# 4 - Multiplication Table While Demo
```
public class MultiplicationTableWhileDemo {
    public static void main(String[] args) {

        int count = 1;

        int table_no = 2;

        while (count <= 4)
        {
            System.out.print(count + " * ");

            System.out.print(table_no + " = ");

            System.out.println((count*table_no));

            count++;
        }
    }
}
```

Output
```
1 * 2 = 2
2 * 2 = 4
3 * 2 = 6
4 * 2 = 8
```

# 5 - Multiplication Table Do While Demo
```
public class MultiplicationTableDoWhileDemo {
    public static void main(String[] args) {

        int count = 10;

        int table_no = 2;

        do
        {
            System.out.print(count + " * ");

            System.out.print(table_no + " = ");

            System.out.println((count*table_no));

            count++;

        }while (count <= 4);
    }
}
```

Output
```
10 * 2 = 20
```

# 6 - Multiplication Table For Demo
```
public class MultiplicationTableForDemo {
    public static void main(String[] args) {

        int count;

        int table_no = 2;

        for (count=1; count <= 4; count++)
        {
            System.out.print(count + " * ");

            System.out.print(table_no + " = ");

            System.out.println((count*table_no));

        }
    }
}
```

Output
```
1 * 2 = 2
2 * 2 = 4
3 * 2 = 6
4 * 2 = 8
```
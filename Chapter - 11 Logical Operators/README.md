# 1 - And
```
public class And {
    public static void main(String[] args) {
        int x = 1;

        int y = 10;

        System.out.print("x = ");

        System.out.println(x);

        System.out.print("y = ");

        System.out.println(y);

        System.out.print(x + " < " + y + " && ");

        System.out.print(x + " != " + y + " = ");

        System.out.print((x<y) && (x!=y));
    }
}
```

Output
```
x = 1

y = 10

1 < 10 && 1 != 10 = true
```

# 2 - Or
```
public class Or {
    public static void main(String[] args) {
        int x = 12;

        int y = 10;

        System.out.print("x = ");

        System.out.println(x);

        System.out.print("y = ");

        System.out.println(y);

        System.out.print(x + " < " + y + " || ");

        System.out.print(x + " != " + y + " = ");

        System.out.print((x<y) || (x!=y));
    }
}
```

Output
```
x = 12

y = 10

12 < 10 || 12 != 10 = true
```
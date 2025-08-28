# 1 - IntegerInput

```
import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {

        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value");

        x = scanner.nextInt();

        System.out.println("Enter y value");

        y = scanner.nextInt();

        System.out.println("x = " + x);

        System.out.println("y = " + y);
    }
}
```

Output
```
Enter x value
2

Enter y value
4

x = 2

y = 4
```

# 2 - FloatInput

```
import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {

        float x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value");

        x = scanner.nextFloat();

        System.out.println("Enter y value");

        y = scanner.nextFloat();

        System.out.println("x = " + x);

        System.out.println("y = " + y);
    }
}
```

Output
```
Enter x value
2

Enter y value
4

x = 2.0

y = 4.0
```

# 3 - DoubleInput

```
import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {

        double x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value");

        x = scanner.nextDouble();

        System.out.println("Enter y value");

        y = scanner.nextDouble();

        System.out.println("x = " + x);

        System.out.println("y = " + y);
    }
}
```

Output
```
Enter x value
2

Enter y value
4

x = 2.0

y = 4.0
```

# 4 - CharacterInput

```
import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {

        char gender;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your gender");

        gender = scanner.next().charAt(0);

        System.out.println("Your Gender is " + gender);
    }
}
```

Output
```
Enter your gender
Male

Your Gender is M


Enter your gender
Female

Your Gender is F
```

# 5 - StringInput

```
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        name = scanner.nextLine();

        System.out.println("Your Name is " + name);
    }
}
```

Output
```
Enter your name

Prabhu

Your Name is Prabhu
```
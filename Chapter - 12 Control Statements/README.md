# 1 - If Demo
```
public class IfDemo {

    public static void main(String[] args) {

        int age = 20;

        if (age >= 18)
        {
            System.out.println("Congrats, You are eligible for voting");
        }

    }
}
```
Output
```
Congrats, You are eligible for voting
```

# 2 - If Else Demo
```
public class IfElseDemo {

    public static void main(String[] args) {

        int age = 11;

        if (age >= 18)
        {
            System.out.println("Congrats, You are eligible for voting");
        }
        else
        {
            System.out.println("Sorry, You are not eligible for voting");
        }
    }
}
```
Output
```
Sorry, You are not eligible for voting
```

# 3 - If Else If Demo
```
public class IfElseIfDemo {

    public static void main(String[] args) {
        int no = 0;

        if (no > 0)
        {
            System.out.println(no + " is positive no");
        }
        else if (no < 0)
        {
            System.out.println(no + " is Negative no");
        }
        else
        {
            System.out.println(no + " is zero");
        }
    }
}
```
Output
```
5 is positive no

-5 is Negative no

0 is zero
```

# 4 - If Else With Logical Operator Demo
```
public class IfElseWithLogicalOperatorDemo {

    public static void main(String[] args) {

        int age = 25;

        if (age >= 18 && age <= 22)
        {
            System.out.println("Congrats, You are eligible for Bank Loan");
        }
        else
        {
            System.out.println("Sorry, You are not eligible for Bank Loan");
        }
    }
}
```

Output
```
Congrats, You are eligible for Bank Loan
```

# 5 - Nested If Else Demo
```
public class NestedIfElseDemo {

    public static void main(String[] args) {

        int age = 20;

        if (age >= 18 && age <= 22)
        {
            System.out.println("Congrats, You are eligible for bank loan");

            if (age >= 18 && age <= 20)
            {
                System.out.println("Car Loan Available");
            }
            else
            {
                System.out.println("Car Loan Not Available");
            }
        }
        else
        {
            System.out.println("Sorry, You are not eligible for bank loan");
        }
    }
}
```
Output
```
Congrats, You are eligible for bank loan
Car Loan Available
```

# 6 - Switch Case Demo
```
public class SwitchCaseDemo {

    public static void main(String[] args) {
        int option = 1;

        switch (option)
        {
            case 1:
                System.out.println("Good Morning");
                break;

            case 2:
                System.out.println("Good Afternoon");
                break;

            case 3:
                System.out.println("Good Evening");
                break;

            case 4:
                System.out.println("Good Night");
                break;

            default:
                System.out.println("Invaild Option");
                break;
        }
    }
}
```
Output
```
Good Morning
```

# 7 - Ternary Operator Demo
```
public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int age = 25;

        System.out.println( (age >= 18) ? "Eligible for voting" : "Not Eligible for voting" );
    }
}
```
Output
```
Eligible for voting
```
# 1 - String Length Demo
```
public class StringLengthDemo {

    public static void main(String[] args) {
        String name = "prabhu";

        // return number of characters in string

        System.out.println(name.length());
    }
}
```

Output
```
6
```

# 2 - String To Lower Case Demo
```
import java.util.Locale;

public class StringToLowerCaseDemo {

    public static void main(String[] args) {

        String name1 = "I AM FROM CUDDALORE";
        
        System.out.println(name1.toLowerCase());
    }
}
```

Output
```
i am from cuddalore
```

# 3 - String To Upper Case Demo
```
public class StringToUpperCaseDemo {

    public static void main(String[] args) {

        String name1 = "i am from cuddalore";
        
        System.out.println(name1.toUpperCase());
    }
}
```

Output
```
I AM FROM CUDDALORE
```

# 4 - String CharAt Demo
```
public class StringCharAtDemo {

    public static void main(String[] args) {

        String name = "prabhu";

        // return character at a location in the sting
        
        System.out.println(name.charAt(0));
    }
}
```

Output
```
p
```

# 5 - String Contructors Demo
```
public class StringContructorsDemo
{
    public static void main(String[] args) {

        char name1[] = {'p','r','a','b','h','u'};

        String name2 = "prabhu";

        String name3 = new String(name1);

        System.out.println(name3);
    }
}
```

Output
```
prabhu
```

# 6 - String Equals Demo
```
public class StringEqualsDemo {

    public static void main(String[] args) {

        String name1 = "prabhu";

        String name2 = name1;

        // equality check on the contents of the two stings
        
        System.out.println(name2.equals(name1));
    }
}
```

Output
```
true
```

# 7 - String Equals Ignore Case Demo
```
public class StringEqualsIgnoreCaseDemo {

    public static void main(String[] args) {

        String name1 = "prabhu";

        String name2 = "PRABHU";

        // equality check on the contents of the two strings without checking
        // lowercase or uppercase
        
        System.out.println(name2.equalsIgnoreCase(name1));
    }
}
```

Output
```
true
```

# 8 - String Starts With Demo
```
public class StringStartsWithDemo {

    public static void main(String[] args) {

        String name1 = "i am from cuddalore";
        
        System.out.println(name1.startsWith("i am for"));
    }
}
```

Output
```
false
```

# 9 - String Ends With Demo
```
public class StringEndsWithDemo {

    public static void main(String[] args) {

        String name1 = "i am from cuddalore";
        
        System.out.println(name1.endsWith("chennai"));
    }
}
```

Output
```
false
```

# 10 - String Index Of Demo
```
public class StringIndexOfDemo {

    public static void main(String[] args) {

        String name1 = "prabhu";
        
        System.out.println(name1.indexOf('p'));
    }
}
```

Output
```
0
```

# 11 - String Last Index Of Demo
```
public class StringLastIndexOfDemo {

    public static void main(String[] args) {

        String name1 = "prabhu";
        
        System.out.println(name1.lastIndexOf('p'));
    }
}
```

Output
```
0
```

# 12 - String Sub String Demo
```
public class StringSubStringDemo {

    public static void main(String[] args) {

        String name1 = "i am from cuddalore";

        String name2 = name1.substring(5);
        
        System.out.println(name2);
    }
}
```

Output
```
from cuddalore
```

# 13 - String Concatenation Demo
```
public class StringConcatenationDemo {
    public static void main(String[] args) {

        String age = "9";

        String output = "He is " + age + " years old.";

        System.out.println(output);
    }
}
```

Output
```
He is 9 years old.
```

# 14 - String Compare To Demo
```
public class StringCompareToDemo {

    public static void main(String[] args) {

        String name1 = "prabhu";

        String name2 = "prabhu";
        
        System.out.println(name1.compareTo(name2));
    }
}
```

Output
```
0
```

# 15 - String Compare To Ignore Case Demo
```
public class StringCompareToIgnoreCaseDemo {

    public static void main(String[] args) {

        String name1 = "prabhu";

        String name2 = "PRABHU";
        
        System.out.println(name1.compareToIgnoreCase(name2));
    }
}
```

Output
```
0
```
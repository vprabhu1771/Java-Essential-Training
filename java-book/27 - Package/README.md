# 1 - `Balance.java`
```java
package bank;

public class Balance {

    String name;

    double balance;

    public Balance(String n, double b)
    {
        name = n;

        balance = b;
    }

    public void show()
    {
        if (balance < 0)
        {
            System.out.println("Name : " + name);

            System.out.println("No Balance");
        }
        else if (balance > 0)
        {
            System.out.println("Name : " + name);

            System.out.println("Balance : " + balance);
        }
    }
}
```

# 2 - `ICICIBank.java`
```java
import bank.Balance;

public class ICICIBank {

    public static void main(String[] args) {
        // array object
        Balance obj[] = new Balance[2];

//        crating new object

        obj[0] = new Balance("Prabhu", 1000);

        obj[1] = new Balance("Suresh", -1000);

        for (int i = 0; i < 2; i++) {
            obj[i].show();
        }
    }
}
```
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

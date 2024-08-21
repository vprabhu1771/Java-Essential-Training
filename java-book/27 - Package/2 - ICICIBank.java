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

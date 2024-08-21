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

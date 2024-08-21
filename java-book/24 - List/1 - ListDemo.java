import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        // Add an element
        names.add("Prabhu");

        names.add("Rajesh");

        System.out.println(names);

        // clear mean formatting names list
        names.clear();

        System.out.println(names);

        // Index of an element
        System.out.println(names.indexOf("Prabhu"));

        // return array list length
        System.out.println(names.size());

        // return true if array list is empty other wise false
        System.out.println(names.isEmpty());
    }
}

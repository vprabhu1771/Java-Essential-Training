public class InterfaceDemo {
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();

        Circle obj2 = new Circle();

        System.out.print("Area of the rectangle : ");

        System.out.println(obj1.compute(2,2));

        System.out.println("Area of Circle : ");

        System.out.println(obj2.compute(10,0));
    }
}

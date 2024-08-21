public class BoxDemo {
    public static void main(String[] args) {
        Box obj = new Box();

        obj.setDim(2,2,2);

        System.out.print("Width : ");

        System.out.println(obj.width);

        System.out.print("Height : ");

        System.out.println(obj.height);

        System.out.print("Depth : ");

        System.out.println(obj.depth);

        System.out.println(obj.volumee());
    }
}

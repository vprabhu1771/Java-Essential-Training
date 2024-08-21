public class Circle implements Area{
    @Override
    public double compute(double x, double y) {
        return pi*x*x;
    }
}

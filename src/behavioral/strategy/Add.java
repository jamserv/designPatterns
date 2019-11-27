package behavioral.strategy;

/**
 *
 * @author janez
 */
public class Add implements Arithmetic {

    @Override
    public Double operation(double a, double b) {
        return (a + b);
    }

}

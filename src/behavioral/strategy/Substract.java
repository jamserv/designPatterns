package behavioral.strategy;

/**
 *
 * @author janez
 */
public class Substract implements Arithmetic {

    @Override
    public Double operation(double a, double b) {
        return (a - b);
    }

}

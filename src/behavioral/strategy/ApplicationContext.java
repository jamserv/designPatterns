package behavioral.strategy;

/**
 *
 * @author janez
 */
public class ApplicationContext {

    private Arithmetic arithmetic;

    public ApplicationContext(Arithmetic arithmetic) {
        this.arithmetic = arithmetic;
    }

    public Arithmetic getArithmetic() {
        return arithmetic;
    }

}

package behavioral.strategy;

/**
 *
 * @author janez
 */
public class RunStrategy {

    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(new Add());

        System.out.println("result :: " + context.getArithmetic().operation(5D, 4D));

        context = new ApplicationContext(new Substract());

        System.out.println("result :: " + context.getArithmetic().operation(5D, 4D));
    }
}

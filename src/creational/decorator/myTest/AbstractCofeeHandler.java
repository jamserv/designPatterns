package creational.decorator.myTest;

import creational.decorator.Cofee;
import java.util.List;

/**
 *
 * @author janez
 */
public abstract class AbstractCofeeHandler {

    protected List<Cofee> cofeeTypes;

    protected void addCofeeType(Cofee cofee) {
        cofeeTypes.add(cofee);
    }

    protected void printInvoice() {
        cofeeTypes.stream().forEach((cofee) -> {
            System.out.println("item :: " + cofee.getDescription() + " prince ::" + cofee.getPrice());
        });
    }

}

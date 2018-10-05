package structurals.decorator.myTest;

import structurals.decorator.BaseCofee;
import structurals.decorator.CacaoCofee;
import structurals.decorator.Cofee;
import structurals.decorator.MilkCofee;
import java.util.ArrayList;

/**
 *
 * @author janez
 */
public class MainMyTest extends AbstractCofeeHandler {

    public static void main(String[] args) {
        Cofee cofee = new BaseCofee();
        Cofee cofee1 = new MilkCofee(cofee);
        Cofee cofee2 = new CacaoCofee(cofee);
        
        MainMyTest test = new MainMyTest();
        test.cofeeTypes = new ArrayList<>();
        test.addCofeeType(cofee1);
        test.addCofeeType(cofee2);
        
        test.printInvoice();

    }

  
    
}

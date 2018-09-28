package creational.decorator.myTest;

import creational.decorator.BaseCofee;
import creational.decorator.CacaoCofee;
import creational.decorator.Cofee;
import creational.decorator.MilkCofee;
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

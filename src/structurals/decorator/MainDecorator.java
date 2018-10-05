
package structurals.decorator;

/**
 *
 * @author janez
 */
public class MainDecorator {
    public static void main(String[] args) {
        Cofee cofee = new BaseCofee();
        
        Cofee c2 = new MilkCofee(new CacaoCofee(cofee));
        
        System.out.println(c2.getDescription() + " price :: " + c2.getPrice());
    }
}

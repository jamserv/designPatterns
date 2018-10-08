
package structural.decorator;

/**
 *
 * @author janez
 */
public class CacaoCofee implements Cofee{
    
    private Cofee cofee;

    public CacaoCofee(Cofee cofee) {
        this.cofee = cofee;
    }        

    @Override
    public String getDescription() {   
        return cofee.getDescription() + " + cacao";
    }

    @Override
    public Double getPrice() {
        return cofee.getPrice() + 0.30;
    }
    
}

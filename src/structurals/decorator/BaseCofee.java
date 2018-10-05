package structurals.decorator;

/**
 *
 * @author janez
 */
public class BaseCofee implements Cofee {

    @Override
    public String getDescription() {
        return "Cofee";
    }

    @Override
    public Double getPrice() {
        return 100.0;
    }

}

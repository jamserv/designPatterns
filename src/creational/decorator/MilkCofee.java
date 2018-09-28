package creational.decorator;

/**
 *
 * @author janez
 */
public class MilkCofee implements Cofee {

    private Cofee cofee;

    public MilkCofee(Cofee cofee) {
        this.cofee = cofee;
    }

    @Override
    public String getDescription() {
        return cofee.getDescription() + " + milk";
    }

    @Override
    public Double getPrice() {
        return cofee.getPrice() + 0.20;
    }

}

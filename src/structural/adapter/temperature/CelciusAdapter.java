package structural.adapter.temperature;

/**
 *
 * @author janez
 */
public class CelciusAdapter implements Temperature {

    Temperature temperature;

    public CelciusAdapter(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public Double value() {
        return ((this.temperature.value() - 32) * 5 / 9);
    }

}

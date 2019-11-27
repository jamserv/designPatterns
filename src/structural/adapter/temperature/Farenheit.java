package structural.adapter.temperature;

/**
 *
 * @author janez
 */
public class Farenheit implements Temperature {

    private Double value;

    public Farenheit(Double value) {
        this.value = value;
    }

    @Override
    public Double value() {
        return this.value;
    }

}

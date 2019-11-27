package structural.adapter.temperature;

/**
 *
 * @author janez
 */
public class KelvinAdapter implements Temperature {
    
    Temperature temperature;

    public KelvinAdapter(Temperature temperature) {
        this.temperature = temperature;
    }        

    @Override
    public Double value() {
        return ((this.temperature.value() - 32) * 5 / 9 + 273.15);
    }
    
}

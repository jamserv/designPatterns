package structural.adapter.temperature;

/**
 *
 * @author janez
 */
public class RunTemperatureAdapter {
    public static void main(String[] args) {
        Temperature temperature = new Farenheit(101d);        
        
        double f = temperature.value();
        System.out.println("farenh ... " + f);
        
        
        Temperature celcius = new CelciusAdapter(temperature);
        f = celcius.value();
        System.out.println("celciu ... " + f);
        
        Temperature kelvin = new KelvinAdapter(temperature);
        f = kelvin.value();
        System.out.println("kelvin ... " + f);
                
    }
}

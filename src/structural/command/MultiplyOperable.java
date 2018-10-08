package structural.command;

import java.util.List;

/**
 *
 * @author jamse
 */
public class MultiplyOperable implements Task{
    
    List<Integer> values;

    public MultiplyOperable(List<Integer> values) {
        this.values = values;
    }

    @Override
    public double execute() {
        double retult = 1;
        for (Integer value : values) {
            retult = (value * retult);
        }       
        System.out.println("result :: " + retult);
        return retult;
    }
    
}

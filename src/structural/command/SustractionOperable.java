package structural.command;

import java.util.List;

/**
 *
 * @author jamse
 */
public class SustractionOperable implements Task {

    List<Integer> values;

    public SustractionOperable(List<Integer> values) {
        this.values = values;
    }

    @Override
    public double execute() {
        double result = 0;
        for (Integer value : values) {
            result += value;
        }
        System.out.println("result :: " + result);
        return result;
    }

}

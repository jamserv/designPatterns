package creational.factoryMethod;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author janez
 */
public class RunFactory {

    public static void main(String[] args) {
        ProcessorBase factory = new ProcessorFactory();
        List<Processor> processors = factory.processors();
        for (Processor processor : processors) {
            Map<String, Object> map = new HashMap<>();
            map.put("amount", new BigDecimal(20.567).setScale(2, RoundingMode.UP));
            
            Map<String, Object> response = processor.pay(map);
            System.out.println(processor.getClass().getCanonicalName() + "..." + response);
        }
    }

}

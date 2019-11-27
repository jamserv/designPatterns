package factoryMethod;


import creational.factoryMethod.Processor;
import creational.factoryMethod.ProcessorBase;
import creational.factoryMethod.ProcessorFactory;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author janez
 */
public class FactoryMethodTest {

    @Test
    public void hello() {
        ProcessorBase factory = new ProcessorFactory();
        List<Processor> processors = factory.processors();
        for (Processor processor : processors) {
            Map<String, Object> map = new HashMap<>();
            map.put("amount", new BigDecimal(20.567).setScale(2, RoundingMode.UP));

            Map<String, Object> response = processor.pay(map);
            System.out.println(processor.getClass().getCanonicalName() + "..." + response);

            Assert.assertEquals(new BigDecimal("20.57"), response.get("amount"));
            Assert.assertEquals("0", response.get("response_code"));
        }
    }
}

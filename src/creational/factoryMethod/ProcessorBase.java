package creational.factoryMethod;

import java.util.List;
import java.util.Map;

/**
 *
 * @author janez
 */
public interface ProcessorBase {
    
    List<Processor> processors();        
    
    Map<String, Object> pay(Processor processor, Map<String, Object> pay);
    
    Integer saveTransaction(Map<String, Object> result);
}

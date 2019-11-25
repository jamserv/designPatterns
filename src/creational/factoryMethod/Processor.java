package creational.factoryMethod;

import java.util.Map;

/**
 *
 * @author janez
 */
public interface Processor {
    
    Map<String, Object> params();
    
    Map<String, Object> pay(Map<String, Object> pay);
}

package creational.factoryMethod;

import java.util.Map;

/**
 *
 * @author janez
 */
public class Paypal implements Processor {

    @Override
    public Map<String, Object> params() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Object> pay(Map<String, Object> pay) {
        pay.put("response_code", "-1000");
        pay.put("response_message", "Rejected: Amount no available");
        return pay;
    }
    
}

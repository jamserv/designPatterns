package creational.factoryMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author janez
 */
public class ProcessorFactory implements ProcessorBase {

    @Override
    public List<Processor> processors() {
        List<Processor> list = new ArrayList<>();
        list.add(new GooglePay());
        list.add(new Paypal());
        list.add(new Behalf());
        
        return list;
    }

    @Override
    public Map<String, Object> pay(Processor processor, Map<String, Object> pay) {
        return processor.pay(pay);
    }

    @Override
    public Integer saveTransaction(Map<String, Object> result) {        
        return 0;
    }

}

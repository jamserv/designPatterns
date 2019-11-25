package creational.abstractFactory;

import creational.abstractFactory.auth.Authentication;
import creational.abstractFactory.auth.GoogleAuth;
import creational.abstractFactory.processors.PaymentProcessor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janez
 */
public class MobileFactory implements GUIFactory{

    @Override
    public List<Authentication> authentication() {
        List<Authentication> list = new ArrayList<>();
        Authentication authentication = new GoogleAuth();
        list.add(authentication);
        
        return list;
    }

    @Override
    public List<PaymentProcessor> paymentProcessor() {
        List<PaymentProcessor> list = new ArrayList<>();
        
        return list;
    }

    
}

package creational.abstractFactory;

import creational.abstractFactory.auth.Authentication;
import creational.abstractFactory.auth.FacebookAuth;
import creational.abstractFactory.auth.GoogleAuth;
import creational.abstractFactory.processors.PaymentProcessor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janez
 */
public class WebFactory implements GUIFactory {

    @Override
    public List<Authentication> authentication() {
        List<Authentication> list = new ArrayList<>();
        list.add(new GoogleAuth());
        list.add(new FacebookAuth());

        return list;
    }

    @Override
    public List<PaymentProcessor> paymentProcessor() {
        List<PaymentProcessor> list = new ArrayList<>();

        return list;
    }

}

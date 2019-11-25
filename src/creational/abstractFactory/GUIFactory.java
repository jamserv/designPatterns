package creational.abstractFactory;

import creational.abstractFactory.auth.Authentication;
import creational.abstractFactory.processors.PaymentProcessor;
import java.util.List;

/**
 *
 * @author janez
 */
public interface GUIFactory {

    List<Authentication> authentication();

    List<PaymentProcessor> paymentProcessor();
   
}

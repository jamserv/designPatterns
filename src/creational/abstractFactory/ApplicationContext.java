package creational.abstractFactory;

import creational.abstractFactory.auth.Authentication;
import creational.abstractFactory.processors.PaymentProcessor;
import java.util.List;

/**
 *
 * @author janez
 */
public class ApplicationContext {

    private List<Authentication> authentication;
    private List<PaymentProcessor> paymentProcessor;    

    public ApplicationContext(GUIFactory factory) {
        this.authentication = factory.authentication();
        this.paymentProcessor = factory.paymentProcessor();        
    }
    
    public void deploy() throws InterruptedException {
        //manage cache here ...ie memCache...redis...sprnig-cache
        System.out.println("...deploying app.. please wait...");
        
        Thread.sleep(2000);
    }    

}

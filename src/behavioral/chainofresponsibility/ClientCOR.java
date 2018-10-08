package behavioral.chainofresponsibility;

/**
 *
 * @author jamse
 */
public class ClientCOR {
    
    public static void main(String[] args) {
        Handler handler = new ConcreteHandler();
        handler.setNext(handler);
        handler.request();
    }
    
}

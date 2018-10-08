package behavioral.chainofresponsibility;

/**
 *
 * @author jamse
 */
public class ConcreteHandler extends BaseHandler{
        
    @Override
    public Handler request() {
        return next;
    }

    
}

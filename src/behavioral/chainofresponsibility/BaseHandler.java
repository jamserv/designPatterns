package behavioral.chainofresponsibility;

/**
 *
 * @author jamse
 */
public abstract class BaseHandler implements Handler {

    Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public Handler request() {
        return next;
    }

}

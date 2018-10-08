package behavioral.chainofresponsibility;

/**
 *
 * @author jamse
 */
public interface Handler {

    void setNext(Handler handler);

    abstract Handler request();
}

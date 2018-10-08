package behavioral.iterator;

/**
 *
 * @author janez
 */
public class ListCollection extends TransversalCollection {

    @Override
    public TransversalAbstraction createTransversalObject() {
        return new ListTransversal();
    }
    
}

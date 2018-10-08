package behavioral.iterator;

/**
 *
 * @author janez
 */
public class ClientIterator {

    public static void main(String[] args) {
        TransversalCollection collection = new ListCollection();                
        
        TransversalAbstraction abstraction = collection.createTransversalObject();
        abstraction.next();
                        
        
    }

}

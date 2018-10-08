package behavioral.iterator;

/**
 *
 * @author janez
 */
public class ListTransversal extends TransversalAbstraction{

    @Override
    public void first() {
        
    }

    @Override
    public void next() {
        for (int index = 0; index < 10; index++) {            
            System.out.println("index :: " + index);
        }
    }

    @Override
    public void isDone() {
        System.out.println("is done");
    }
    
}

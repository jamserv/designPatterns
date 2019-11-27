package behavioral.state;

/**
 *
 * @author janez
 */
public class RunState {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        //applicationContext.execute(new ProcessingTask());
        
        applicationContext.execute();
    }
}

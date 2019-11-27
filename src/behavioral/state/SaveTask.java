package behavioral.state;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janez
 */
public class SaveTask implements Task {

    @Override
    public void execute(ApplicationContext applicationContext) {
          try {
            System.out.println("task -> saving...");
            Thread.sleep(1000);
            applicationContext.execute(new FinishTask());
        } catch (InterruptedException ex) {
            Logger.getLogger(ProcessingTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

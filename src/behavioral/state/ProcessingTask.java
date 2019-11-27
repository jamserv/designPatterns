package behavioral.state;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janez
 */
public class ProcessingTask implements Task {

    @Override
    public void execute(ApplicationContext applicationContext) {
        try {
            System.out.println("task -> processing...");
            Thread.sleep(2000);
            applicationContext.execute(new SaveTask());
        } catch (InterruptedException ex) {
            Logger.getLogger(ProcessingTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

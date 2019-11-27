package behavioral.state;

/**
 *
 * @author janez
 */
public class ApplicationContext {

    private Task task;

    public void execute(Task task) {
        this.task = task;
        this.task.execute(this);
    }
    
    public void execute() {        
        new ApplicationContext().execute(new ProcessingTask());
        //new ApplicationContext().execute(new SaveTask());
        //new ApplicationContext().execute(new FinishTask());
    }

}

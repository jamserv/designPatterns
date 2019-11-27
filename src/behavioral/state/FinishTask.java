package behavioral.state;

/**
 *
 * @author janez
 */
public class FinishTask implements Task {

    @Override
    public void execute(ApplicationContext applicationContext) {
        System.out.println("task -> finish...");
    }

}

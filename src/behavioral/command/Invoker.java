package behavioral.command;

import java.util.List;

/**
 *
 * @author jamse
 */
public class Invoker {

    private Task task;
    private List<Task> tasks;

    public Invoker(Task task) {
        this.task = task;
    }

    public Invoker(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Invoker(Task task, List<Task> tasks) {
        this.task = task;
        this.tasks = tasks;
    }

    public void executeSingleCommand() {
        if (task != null) {
            task.execute();
        }
    }

    public void executeAllCommands() {
        if (tasks != null) {
            tasks.forEach((task) -> {
                task.execute();
            });
        }
    }

}

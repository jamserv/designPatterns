package structural.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientCommand {
    public static void main(String[] args) {
        Task suma = new SustractionOperable(Arrays.asList(1,2,3,4,5));
        Task mult = new MultiplyOperable(Arrays.asList(1,2,3,4,5));
        
        List<Task> tasks = new ArrayList<>();
        tasks.add(suma);
        tasks.add(mult);
        
        Invoker invoker = new Invoker(Arrays.asList(suma, mult));
        invoker.executeSingleCommand();
        //invoker.executeAllCommands();
    }
}

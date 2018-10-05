package structurals.composite.practice;

/**
 *
 * @author janez
 */
public class ClientPractice {

    public static void main(String[] args) {
        Employee employee1 = new Developer("janez", 2500);
        Employee employee2 = new Developer("johanna", 3000);

        Employee manager = new Manager("isabel", 5000);
        manager.add(employee1);
        manager.add(employee2);

        Employee emp3 = new Developer("Michael", 20000);
        Manager generalManager = new Manager("Mark", 50000);
        generalManager.add(emp3);
        generalManager.add(manager);

        generalManager.print();
    }
}

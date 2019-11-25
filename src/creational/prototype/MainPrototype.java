package creational.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janez
 */
public class MainPrototype {

    public static void main(String[] args) {
        try {
            Person person1 = new Person("9984", "isabel");
            Person person2 = (Person) person1.clone();

            System.out.println(person1.getName());

            person2.setName("janez");

            System.out.println(person2.getName());
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(MainPrototype.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

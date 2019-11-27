package prototype;

import creational.prototype.Person;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author janez
 */
public class PrototipeTets {

    @Test
    public void hello() {
        try {
            Person person1 = new Person("9984", "isabel");
            Person person2 = (Person) person1.clone();
            person2.setName("janez");

            Assert.assertNotEquals(person1, person2);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PrototipeTets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

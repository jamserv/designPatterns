package creational.singleton;

import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author janez
 */
public class SingletonTest {

    @Test
    public void init() {
        CacheProperties properties = CacheProperties.getInstance();
        for (int index = 0; index < 5; index++) {            
            Map<String, String> props = properties.getProperties();
            props.put("GCM_KEY", UUID.randomUUID().toString().toUpperCase());

            for (Map.Entry<String, String> entry : props.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                System.out.println(key + "..." + value);
            }
            
            Assert.assertEquals(properties, CacheProperties.getInstance());
        }
    }

}

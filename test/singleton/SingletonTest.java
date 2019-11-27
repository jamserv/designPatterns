/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import creational.singleton.CacheProperties;
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
    public void run() {
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

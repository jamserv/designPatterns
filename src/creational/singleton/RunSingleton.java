package creational.singleton;

import java.util.Map;
import java.util.UUID;

/**
 *
 * @author janez
 */
public class RunSingleton {

    public static void main(String[] args) {
        for (int index = 0; index < 5; index++) {

            CacheProperties properties = CacheProperties.getInstance();
            Map<String, String> props = properties.getProperties();
            props.put("GCM_KEY", UUID.randomUUID().toString().toUpperCase());

            for (Map.Entry<String, String> entry : props.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                System.out.println(key + "..." + value);
            }
        }

    }
}

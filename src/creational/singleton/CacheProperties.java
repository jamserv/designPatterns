package creational.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author janez
 */
public class CacheProperties {

    static CacheProperties instance;
    static private Map<String, String> properties;

    static CacheProperties getInstance() {
        if (instance == null) {
            System.out.println(" -- crea instance -- ");
            instance = new CacheProperties();

            properties = new HashMap<>();
            properties.put("FIREBASE_KEY", UUID.randomUUID().toString().toUpperCase());
            return instance;
        }
        System.out.println(" -- usa existente -- ");
        return instance;
    }

    public static Map<String, String> getProperties() {
        return properties;
    }

}

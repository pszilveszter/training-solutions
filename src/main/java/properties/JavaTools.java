package properties;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class JavaTools {

    private Properties properties = new Properties();


    public JavaTools() {
        try (InputStreamReader reader = new InputStreamReader(this.getClass().getResourceAsStream("/tools.properties"), StandardCharsets.UTF_8)) {
            properties.load(reader);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to load resource", ioe);
        }
    }


    public Set<String> getToolKeys() {
        Set<String> keys = new HashSet<>();
        for (String k: properties.stringPropertyNames()) {
            keys.add(k.substring(0, k.indexOf(".")));
        }
        return keys;
    }


    public Set<String> getTools() {
        Set<String> names = new HashSet<>();
        for (String k: getToolKeys()) {
            names.add(getName(k));
        }
        return names;
    }


    public String getName(String key) {
        return properties.getProperty(key + ".name");
    }


    public String getUrl(String key) {
        return properties.getProperty(key + ".url");
    }
}

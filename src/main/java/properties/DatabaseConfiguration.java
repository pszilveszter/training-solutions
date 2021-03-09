package properties;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class DatabaseConfiguration {

    private static final Charset CHAR_ENCODING = StandardCharsets.UTF_8;
    private Properties properties = new Properties();

    public DatabaseConfiguration() {
        try (InputStreamReader is = new InputStreamReader(DatabaseConfiguration.class.getResourceAsStream("/db.properties"),
                DatabaseConfiguration.CHAR_ENCODING)) {
            properties.load(is);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Unable to read file", ioe);
        }
    }

    public DatabaseConfiguration(File file) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file), DatabaseConfiguration.CHAR_ENCODING)) {
            properties.load(reader);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public String getHost() {
        return properties.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(properties.getProperty("db.port"));
    }

    public String getSchema() {
        return properties.getProperty("db.schema");
    }
}

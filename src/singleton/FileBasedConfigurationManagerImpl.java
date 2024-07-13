package singleton;

import java.io.File;
import java.io.PrintWriter;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static volatile FileBasedConfigurationManager configManager = null;

    private FileBasedConfigurationManagerImpl() {

    }

    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
//        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        Object value = properties.getProperty(key);

        if(value == null) return null;

        if(type == Integer.class) {
            return type.cast(Integer.parseInt(value.toString()));
        }

        return (type.cast(value));
//        return (T) properties.getProperty(key);
//        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        properties.setProperty(key, value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }

    public FileBasedConfigurationManager getaInstance() {
        if (configManager == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (configManager == null) {
                    configManager = new FileBasedConfigurationManagerImpl();
                }
            }
        }

        return configManager;
    }

    public static void resetInstance() {
        configManager = null;
    }
}

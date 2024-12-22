package DesignPatterns.CreationalDesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConfigurationManager {
   private static   Lock lock = new ReentrantLock();
    private static ConfigurationManager instance;
    private Properties properties;

    private ConfigurationManager() {
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/resource/config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            lock.lock();
            if(instance == null)
            instance = new ConfigurationManager();
            lock.unlock();
        }
        return instance;
    }

    public String get(String key){
        return properties.getProperty(key);
    }
    public String get(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}

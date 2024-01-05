package com.loop.utillities;



import java.io.FileInputStream;
import java.util.Properties;

/**
 * this class os designed to read properties file and send the data to source code
 */
public class ConfigurationReader {

    private static Properties properties;

    static {
        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName){
        return properties.getProperty(keyName);
    }
}
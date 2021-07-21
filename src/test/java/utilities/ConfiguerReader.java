package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfiguerReader {
    private ConfiguerReader(){

    }
    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream("configuer.properties");
            properties.load(file);
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}

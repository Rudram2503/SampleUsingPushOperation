package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataPropertyFile {
    public String readDataFromProperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream(AutoConstant.PROPERTY_FILE_PATH);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }
}

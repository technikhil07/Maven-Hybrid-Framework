package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public static String getValueForKey(String key) throws Throwable{
		Properties configProperties = new Properties();
		FileInputStream fi = new FileInputStream("D:\\Selenium_FrameWorks\\ERP_Maven\\PropertyFile\\Envirment.properties");
		configProperties.load(fi);
		return configProperties.getProperty(key);

	}
}

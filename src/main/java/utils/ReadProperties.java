package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static String getElementValue(String filename, String key) {

		Properties prop = new Properties();
		String value = null;

		FileInputStream filePath;
		try {
			filePath = new FileInputStream("./ObjectRepostories/"+filename+".properties");			
			prop.load(filePath);	
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}	catch (IOException e) {			
			e.printStackTrace();
		}
		return value;	
	}

}

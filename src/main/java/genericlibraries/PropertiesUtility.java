package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.apache.poi.hpsf.Property;
/**
 * this class contains reusable methods to perform actions on properties file
 * @author COMP
 *
 */

public class PropertiesUtility {

	private Properties property;

	public void propertiesInitialization(String filepath) {
		FileInputStream fis= null;
		try {
			fis= new FileInputStream(filepath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		property = new Properties();
		
		try {
			property.load(fis);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public String fetchProperty(String key) {
		return property.getProperty(key);
	}
}
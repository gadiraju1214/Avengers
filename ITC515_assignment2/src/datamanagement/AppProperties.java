package datamanagement;

import java.util.*;
import java.io.*;

public class AppProperties {  //class contains the properties of the form
	private static AppProperties self = null;
	private Properties properties;

	
	public static AppProperties getInstance() {
		if (self == null) {
			self = new AppProperties();
		}
		return self;
	}

	private AppProperties() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("Properties.prop"));// load properties from form
		} catch (IOException e) {
			throw new RuntimeException("Could not read property file");
		}
	}// if property file not found

	public Properties getProperties() { // method to return properties from form 
		return properties;
	}
}

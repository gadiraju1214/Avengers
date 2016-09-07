package datamanagement;

import java.util.*;
import java.io.*;

public class AppProperties {  //class contains the properties of the form
	private static AppProperties self = null;
	private Properties properties;

	//static get instance method to return self
	public static AppProperties getInstance() {
		if (self == null) {
			self = new AppProperties();
		}
		return self;
	}

	private AppProperties() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("Properties.prop"));
			// load properties from "roperties.prop"
		} catch (IOException e) {
			throw new RuntimeException("Could not read property file");
		}
	}// if property  file not found

	public Properties getProperties() { // method to return properties from form 
		return properties;
		//Method getproperties return properties
	}
}

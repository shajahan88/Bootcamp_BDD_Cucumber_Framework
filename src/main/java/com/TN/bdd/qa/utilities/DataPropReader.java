package com.TN.bdd.qa.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class DataPropReader {
public static Properties initalizeDataPropertiesFile() throws Exception {
		
		Properties dataprop = new Properties();
		FileInputStream dp = new FileInputStream("C:\\Users\\shaja\\eclipse-workspace\\BDD_Cucumber_Framework\\src\\test\\resources\\properties_files\\dataprop.properties");
		dataprop.load(dp);
		
		
		 return dataprop;
	}
}

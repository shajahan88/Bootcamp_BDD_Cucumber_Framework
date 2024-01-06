package com.bdd.Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.TN.bdd.qa.utilities.ConfigReader;
import com.TN.bdd.qa.utilities.DataPropReader;
import com.bdd.DriverLogic.Driverfactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	public WebDriver driver;	
	public Properties prop;
	public Properties dataprop;
		
		
		
		
		@Before
		public void setup() throws Exception {
			prop = ConfigReader.initalizeConfigPropertiesFile();
			dataprop=DataPropReader.initalizeDataPropertiesFile();
			Driverfactory.initalizeBrowser(prop.getProperty("browser"));
			driver = Driverfactory.getdriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
			driver.get(prop.getProperty("url"));
		}
		
		@After
		public void teardown() {
			driver.quit();
		}
		
		}





package com.cloudinfomatrix.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	
	public TestBase()  {
		try {
			prop =new Properties();
			FileInputStream fis= new FileInputStream("/PageObjectModel/src/main/java/com/cloudinfomatrix/qa/config/config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

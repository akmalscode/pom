package com.cloudinfomatrix.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cloudinfomatrix.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
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
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/PageObjectModel/src/main/java/Driver/chromedriver");
			driver=new ChromeDriver();			
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver","/PageObjectModel/src/main/java/Driver/geckodriver");
			driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLECIT_WIIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}

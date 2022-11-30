package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.util;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver(String browserName) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(util.PAGE_LOAD_TIME, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(util.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
			return driver;
		}
		

	public Properties initializeProperties() {
		prop = new Properties();
		try {
			FileInputStream inputStream = new FileInputStream(
			"C:\\Users\\SHUBHAM\\eclipse-workspace\\Keyword_Driven\\src\\main\\java\\config\\config.properties");
			prop.load(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		
	}

}
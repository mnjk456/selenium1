package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utility {
	
	public static WebDriver getDriver(String bwr)
	{
		if(bwr.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_h2a.06.17\\Downloads\\Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(bwr.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_h2a.06.17\\Downloads\\Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else if(bwr.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_h2a.06.17\\Downloads\\Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else
			return null;
	}

}

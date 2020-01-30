package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = Utility.getDriver("chrome");
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("page title"+driver.getTitle());
		System.out.println("number of links :"+links.size());
		Thread.sleep(3000);
		for(int i =0; i<links.size();i++)
		{
			System.out.println("Link Text:"+links.get(i).getText());
			
		}
		
		driver.close();
		

	}

}

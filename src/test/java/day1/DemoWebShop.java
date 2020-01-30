package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		List<WebElement> list = driver.findElements(By.name("Gender"));
		System.out.println("size of list :"+list.size());
		
		if(list.get(0).isSelected())
		{
			list.get(1).click();
		}
		else
		{
			list.get(0).click();
		}
		
		driver.findElement(By.id("FirstName")).sendKeys("manoj");
		
		driver.findElement(By.name("LastName")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("perfTest1@test.com");
		
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Test@123");
		
		driver.findElement(By.cssSelector("#register-button")).submit();
		
		Thread.sleep(5000);
		
		driver.close();		

	}

}

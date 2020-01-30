package day1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_h2a.06.17\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		Dimension d = new Dimension(300,600);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(100,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		System.out.println("Page current Url"+driver.getCurrentUrl());
		driver.close();

	}

}

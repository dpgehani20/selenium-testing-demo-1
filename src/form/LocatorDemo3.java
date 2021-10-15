package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//using css - id or
		driver.findElement(By.cssSelector("#email")).sendKeys("test");
		
		//tag & classname  or
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("test");
		
		//tag & attributes
		driver.findElement(By.cssSelector("[name=email]")).sendKeys("test");
		
		driver.close();
		
		

	}

}

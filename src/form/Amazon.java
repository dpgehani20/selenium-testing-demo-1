package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("laptop");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(1000);
		//new laptop
		
//		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		driver.findElement(By.id("a-autoid-0-announce")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price: Low to High")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		
		driver.close();

	}

}

package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search_query")).sendKeys("T-shrit");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(1000);
		
		//Link Text
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
//		driver.findElement(By.partialLinkText("Printed Chiffon ")).click();
		
		

	}

}

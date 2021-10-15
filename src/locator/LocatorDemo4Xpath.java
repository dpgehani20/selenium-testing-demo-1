package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//Absolute Xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("blouse");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();

		
		//OR Relative Xpath
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirt");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		
		//Xpath with OR opr
		driver.findElement(By.xpath("//input[@id='search_query1_top' or @name='search_query']")).sendKeys("shirt");
		driver.findElement(By.xpath("//button[@name='submit_searchX' or @class='btn btn-default button-search']")).click();
		
		//Xpath with AND opr
		driver.findElement(By.xpath("//input[@id='search_query1_top' and @name='search_query']")).sendKeys("shirt");
		
		//Xpath with contains()
		driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-shirt");  //search_query_top
		driver.findElement(By.xpath("//button[contains(@name,'search')]")).click(); //submit_search
		
		//Xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@id,'query_top')]")).sendKeys("Shirt");
		driver.findElement(By.xpath("//input[starts-with(@name,'submit_')]")).click();
		
		//Xpath with test()
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//Xpath chained
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirt");
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search'")).click();
	}

}

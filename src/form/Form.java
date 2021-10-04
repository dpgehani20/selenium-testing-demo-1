package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div[6]/input")).sendKeys("XYZ");
		
		driver.findElement(By.id("sex-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"exp-0\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("profession")).click();
		Thread.sleep(2000);
		
//		// Select Continent
//        driver.findElement(By.id("continents")).click();
//        WebElement dropdown = driver.findElement(By.id("continents"));
//        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
		
		
		driver.findElement(By.name("continents")).click();
		WebElement dropdown = driver.findElement(By.id("continents"));
		dropdown.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div[1]/article/div/div/div[3]/div[1]/div/div[26]/div[2]/select/option[2]")).click();
		Thread.sleep(3000);
		
		driver.close();

	}

}

package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nopcomm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
		Thread.sleep(1500);
		
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		//=========================
		
		if(txt.contentEquals("Please enter some search keyword")) {
			driver.switchTo().alert().accept();
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
		driver.navigate().back();
		Thread.sleep(1500);
		
		// search product and go back
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		// dropdown
		driver.findElement(By.name("customerCurrency")).click();
		Thread.sleep(2500);
		
		driver.close();

	}

}

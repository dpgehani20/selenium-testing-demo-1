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
		Thread.sleep(1000);
		
		// search product and go back
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		// books dropdown
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
		driver.findElement(By.id("products-pagesize")).click();
		driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]/option[1]")).click();
		driver.findElement(By.id("products-orderby")).click();
		driver.findElement(By.xpath("//*[@id=\"products-orderby\"]/option[4]")).click();
		
		//favorite
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")).click();
		String mzg = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div")).getText();
		System.out.println(mzg);
		driver.navigate().back();
		
		//login
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abc");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		
		// "Wrong email"
		String error = driver.findElement(By.id("Email-error")).getText();
		
		if(error.contentEquals("Please enter your email")) {
			System.out.println("error mzg correct");
		}
		else {
			System.out.println("error mzg wrong");
		}
		
		// dropdown
//		driver.findElement(By.name("customerCurrency")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}

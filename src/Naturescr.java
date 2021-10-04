import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naturescr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nbc.lk/shop");
		
		driver.findElement(By.name("search_input")).sendKeys("aloe");
		
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div/button")).click();
		
		driver.findElement(By.linkText("Deep Cleansing Milk – Aloe Vera")).click();
		
		Thread.sleep(1000);
		
		driver.close();
		
//		WebElement username=driver.findElement(By.id("user_email_Login"));
//		WebElement password=driver.findElement(By.id("user_password"));
//		WebElement login=driver.findElement(By.name("commit"));
//		username.sendKeys("abc@gmail.com");
//		password.sendKeys("your_password");
//		login.click();
		
//		or
		
//		driver.findElement(By.id(“name_3_firstname”)).sendKeys(“eepa”);
		//Radio button
//		driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[2]/div/div/input[1]”)).click();
//		//check box
//		driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[3]/div/div/input[1]”)).click();
//		driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[3]/div/div/input[2]”)).click();
//		driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[3]/div/div/input[3]”)).click();
//		//drop down
//		Select country=new Select(driver.findElement(By.id(“dropdown_7”)));
//		country.selectByVisibleText(“India”);
//		Select month=new Select(driver.findElement(By.id(“mm_date_8”)));
//		month.selectByVisibleText(“7”);
//		Select day =new Select(driver.findElement(By.id(“dd_date_8”)));
//		day.selectByVisibleText(“13”);
//		Select year=new Select(driver.findElement(By.id(“yy_date_8”)));
//		year.selectByVisibleText(“1995”);
//		driver.findElement(By.id(“phone_9”)).sendKeys(“1234567890”);
//		driver.findElement(By.id(“username”)).sendKeys(“deepu123”);
//		driver.findElement(By.id(“email_1”)).sendKeys(“dj123@gmail.com”);
//		Thread.sleep(1000);
		
		

	}

}

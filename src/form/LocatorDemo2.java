package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		//class name
		int slider = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(slider);
		
		//tag name
		int linkno = driver.findElements(By.tagName("a")).size();
		System.out.println(linkno);

	}

}

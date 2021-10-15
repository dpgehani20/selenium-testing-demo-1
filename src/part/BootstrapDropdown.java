package part;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//close popup alert
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		// one dropdown
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> prodTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		selectOptionFromDrop(prodTypes,"Invest");
		//System.out.println("Number of select types: "+prodTypes.size());
		
		/* for(WebElement ptype:prodTypes) {
			 if(ptype.getText().equals("Invest")) {
				ptype.click();
				break;
			}
		} */
		
		//create generic method for more than one bootstrap dropdown
		
		
	}
	
	public static void selectOptionFromDrop(List<WebElement> options, String val) {
		for(WebElement option:options) {
			if(option.getText().equals(val)) {
				option.click();
				break;
			}
		}
	}

}

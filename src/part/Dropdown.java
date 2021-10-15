package part;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//select
		// 1. selectByVisibleText()
		// 2. selectByValue
		// 3. selectByIndex()
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
//		driver.manage().window().maximize();
		
		WebElement dropCountryEle = driver.findElement(By.id("input-country"));
		
//		---------------for single dropdown menu--------------------
		
		Select dropCountry = new Select(dropCountryEle);
		
		dropCountry.selectByVisibleText("United Kingdom");
		dropCountry.selectByValue("222"); // UK
		dropCountry.selectByIndex(13); //ASTL
		
		
		List<WebElement> alloptions = dropCountry.getOptions();
		for(WebElement option:alloptions) {
			if(option.getText().equals("Sri Lanka")) {
				option.click();
				break;
			}
		}
//		---------------for more than single dropdown menu using generic method--------------------	
		
		// Way 1
		Select noOfEmpDrop = new Select(driver.findElement(By.name("NoOfEmployees")));
		noOfEmpDrop.selectByVisibleText("16-20");
		
		Select industryDrop = new Select(driver.findElement(By.name("Industry")));
		industryDrop.selectByVisibleText("Travel");
		
		Select countryDrop = new Select(driver.findElement(By.name("Country")));
		countryDrop.selectByVisibleText("Sri Lanka");
		
		//Way 2 - generic
		WebElement noOfEmpElem = driver.findElement(By.name("NoOfEmployees"));
		selectOptionDropdown(noOfEmpElem,"16-20");
		
		WebElement industryElem = driver.findElement(By.name("Industry"));
		selectOptionDropdown(industryElem, "Travel");
		
		WebElement countryElem = driver.findElement(By.name("Country"));
		selectOptionDropdown(countryElem,"Sri Lanka");
		
		
		driver.close();
		
	}
	
	// multi dropdown way 2
	public static void selectOptionDropdown (WebElement ele,String value) {
		
		Select drop = new Select(ele);
		
		List<WebElement> alloptions = drop.getOptions();
		for(WebElement option:alloptions) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}

}

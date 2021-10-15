package part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class SortedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//close popup alert
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement dropdownEle = driver.findElement(By.name("category_id"));
		Select drpselect = new Select(dropdownEle);
		
		List<WebElement> optionList = drpselect.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(WebElement option:optionList) {
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		System.out.println("Original List : "+originalList);
		System.out.println("Original List : "+tempList);
		
		// stored value then sort temp list
		Collections.sort(tempList); // sorting
		System.out.println("Sort done");
		System.out.println("Original List : "+originalList);
		System.out.println("Original List after sorting: "+tempList);
		
		if(originalList.equals(tempList)) {
			System.out.println("Dropdown sorted");
		}
		else {
			System.out.println("Dropdown not sorted");
		}
		
		driver.close();

	}

}

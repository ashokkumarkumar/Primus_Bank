package nov22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		
//store listbox into select class
		
		Select element=new Select(driver.findElement(By.id("searchDropdownBox")));
		
//verify listbox is single or multi selection
		
		boolean value=element.isMultiple();

		//print value
		
			System.out.println(value);
			
		//select by visible text
			
		element.selectByVisibleText("Baby");
		Thread.sleep(5000);
		
		//select by index
		
		element.selectByIndex(30);
		
		//print 30 item name
		
		System.out.println(element.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		driver.close();
		}
}

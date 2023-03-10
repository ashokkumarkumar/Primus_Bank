package nov24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CountingItems1 {



public static void main(String[] args) throws Throwable  {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://amazon.in");
	Thread.sleep(2000);
	Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
	
//get collection no of items
	List<WebElement> all_items  =  listbox.getOptions();
	System.out.println("no of items are::"+all_items.size());
	
//get collection of items
	for (WebElement each : all_items) {
		Thread.sleep(500);
		System.out.println(each.getText());
	}
	Thread.sleep(2000);
	driver.close();
	
}
}
package nov24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItem1 {

	public static void main(String[] args) throws Throwable {
		

		String item_present="baby";
		boolean item_exist=false;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(1000);
		
//get no of items count	( size )
		
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items=listbox.getOptions();
		System.out.println(all_items.size());
		
		for (WebElement each : all_items) {
			
//get one by one item
			
			String actual_items=each.getText();
			if (actual_items.equalsIgnoreCase(item_present)) {
				item_exist = true;
				break;
			}
				}
		
//it checks true or false
		if (item_exist) {
			System.out.println("Item Present In Listbox::"+item_present);
			
		}
		else {
			System.out.println("Item Not Present IN Listbox::"+item_present);
			}
		Thread.sleep(1000);
		driver.close();
	}
}

package nov24;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingItems {
	
public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		
	//get collection of items
		List<WebElement> all_Items =listbox.getOptions();
		System.out.println("No of items are::"+all_Items.size());
		for (WebElement each : all_Items) {
			Thread.sleep(500);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.close();
		}
        }
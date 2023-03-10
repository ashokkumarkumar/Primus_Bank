package nov24;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class VerifyItem {
	public static void main(String[] args) throws Throwable {
		String item_Present ="baby";
	//String item_Present ="cars";
		boolean item_Exist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each : all_items) {
			//get one by one item 
			String actual_Items =each.getText();
			Thread.sleep(500);
			System.out.println(actual_Items);
			if(actual_Items.equalsIgnoreCase(item_Present)) {
				item_Exist=true;
				break;
			}
			
		}
		//it check true or false
		if(item_Exist)
		{
			System.out.println("Item Present In Listbox::"+item_Present);
		}
		else
		{
			System.out.println("Item Not Present In Listbox::"+item_Present);	
		}
		Thread.sleep(5000);
		driver.close();
	}
    }
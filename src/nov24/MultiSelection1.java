package nov24;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelection1 {
public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		
//verify dropdown is single or multi selection
		
		//list box is multiple or not
			boolean value=dropdown.isMultiple();
			System.out.println(value);
			
		//list box no of all items quantity 
			List<WebElement>all_items=dropdown.getOptions();
			System.out.println(all_items.size());

//select seven items in listbox
		
		for (int i = 0; i < 7; i++) {
			Thread.sleep(2000);
			dropdown.selectByIndex(i);
		}
		
		//dropdown deselect by visible text
			dropdown.deselectByVisibleText("Yellow");
			Thread.sleep(4000);
			
		//dropdown deselect by index 1st position
			dropdown.deselectByIndex(0);
			Thread.sleep(4000);
			
		//dropdown deselect by index 3rd position
			dropdown.deselectByIndex(2);
			Thread.sleep(4000);
			
		//dropdown deselect all
			dropdown.deselectAll();
			Thread.sleep(5000);
		
		driver.close();
		}
}



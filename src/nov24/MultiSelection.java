package nov24;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelection {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
	//verify dropdown is single or multi selection
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		List<WebElement> all_Items = dropdown.getOptions();
		System.out.println(all_Items.size());
	//select seven items in listbox
		for(int i=0;i<7;i++)
		{
			Thread.sleep(2000);
			dropdown.selectByIndex(i);
		}
		dropdown.deselectByVisibleText("Yellow");
		Thread.sleep(4000);
		dropdown.deselectByIndex(0);
		Thread.sleep(4000);
		dropdown.deselectByIndex(2);
		Thread.sleep(4000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.quit();

	}

}
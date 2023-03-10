package nov24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
	//verify dropdown is singlew or multi selection
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		for(int i=0;i<7;i++)
		{
			Thread.sleep(500);
			dropdown.selectByIndex(i);
		}
	//print no of items selected
		List<WebElement> selectd_Items = dropdown.getAllSelectedOptions();
		System.out.println(selectd_Items.size());
		for (WebElement each : selectd_Items) {
			Thread.sleep(500);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.close();

	}

}
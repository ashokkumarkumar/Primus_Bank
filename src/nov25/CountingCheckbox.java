package nov25;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingCheckbox {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_custom_checkbox");
	Thread.sleep(5000);
	//get collection of checkboxes
	List<WebElement>All_Checkboxes=driver.findElements(By.tagName("label"));
	System.out.println("no of checkboxes are::"+All_Checkboxes.size());
for (WebElement each : All_Checkboxes) {
	//verify which check box is true or false
	boolean value=each.isSelected();
	//printname of each checkbox
	String Checkbox_Name=each.getAttribute("")
}
}
	}

}

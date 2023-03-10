package nov21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("");
		Thread.sleep(5000);
//store username into webelement
		WebElement username=driver.findElement(By.xpath(""));
		username.clear();
		username.sendKeys("Admin2");
//store password textbox into webelement
		WebElement password=driver.findElement(By.xpath(""));
		password.clear();
		password.sendKeys("");
		driver.findElement(By.xpath("")).submit();
		
		String expected="dashboard";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Login success::"+expected+"   "+actual);
		}
		else {
			//capture error message
			String errormessage=driver.findElement(By.xpath("")).getText();
			System.out.println(errormessage+ "   "+expected+"    "+actual);
		}
		driver.close();
	}

}

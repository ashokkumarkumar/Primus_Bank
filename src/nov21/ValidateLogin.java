package nov21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
	
//store user name textbox into webelement
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin2");
	
//store password textbox into webelement
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		Thread.sleep(5000);
		String expected ="dashboard";
		String actual = driver.getCurrentUrl();
		
	if(actual.contains(expected))
		{
			System.out.println("Login success::"+expected+"         "+actual);
		}
	else
		{
	
//capture error message
		String errormessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(errormessage+"   "+expected+"     "+actual);
		}
		driver.close();

	}
}
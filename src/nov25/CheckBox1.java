//Write a script to verify check box s selected or not:
//1.storing webelement
//2.checking selected or not
//3.click element

package nov25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		
		//storing webelement
		
		WebElement element=driver.findElement(By.id("remember"));
		
		//checking selected or not
		
		boolean value=element.isSelected();
		System.out.println(value);
		
		//click element
		
		element.click();
		
		
		driver.close();
		}
}

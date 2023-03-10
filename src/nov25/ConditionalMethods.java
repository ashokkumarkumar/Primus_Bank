package nov25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalMethods {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://facebook.com");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(1000);
	WebElement element=driver.findElement(By.name("firstname"));
	
//verify firsname text box is enabled or not
	
	boolean value=element.isEnabled();
	System.out.println(value);
	WebElement element1=driver.findElement(By.name("reg_email_confirmation__"));
	
//verify reenter email text box is displayed or hidden
	
	boolean value1=element1.isDisplayed();
	System.out.println(value1);
	WebElement element2=driver.findElement(By.xpath("//input[@value='2']"));
	
//verify radio button is selected or not
	
	boolean value3=element2.isSelected();
	System.out.println(value3);
	element2.click();
	driver.quit();
	}
}
